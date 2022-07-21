package com.javasm.demo.dao.impl;

import com.javasm.demo.dao.BaseDao;
import com.javasm.demo.util.DBUtil;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.List;
import java.util.Map;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 22:13
 * @description
 */
public abstract class BaseDaoImpl<E> implements BaseDao<E> {
    private String tableName;
    private Class<E> eClass;

    public BaseDaoImpl(Class<E> eClass) {
        this.eClass = eClass;
        this.tableName = eClass.getSimpleName();
    }

    @Override
    public E findOneById(int id) throws Exception {
        Connection connection = DBUtil.getConnection();
        String sql = "select * from " + tableName + " where id=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setObject(1, id);
        ResultSet resultSet = ps.executeQuery();
        E obj = null;
        if (resultSet.next()) {
            obj = eClass.getConstructor().newInstance();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                Object columnValue = resultSet.getObject(columnName);
                StringBuilder methodName = new StringBuilder("set");
                String[] strings = columnName.split("_");
                for (String string : strings) {
                    String value = String.valueOf(string.charAt(0));
                    string = string.replaceFirst(value, value.toUpperCase());
                    methodName.append(string);
                }
                String columnClassName = metaData.getColumnClassName(i);
                Method method = eClass.getMethod(methodName.toString(), Class.forName(columnClassName));
                method.invoke(obj,columnValue);
            }
        }
        DBUtil.close(connection,ps,resultSet);
        return obj;
    }

    @Override
    public List<E> findList() throws Exception {
        return null;
    }
}
