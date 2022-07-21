package com.javasm.demo.test;

import com.javasm.demo.dao.ProductDao;
import com.javasm.demo.dao.UserInfoDao;
import com.javasm.demo.dao.impl.ProductDaoImpl;
import com.javasm.demo.dao.impl.UserInfoDaoImpl;
import com.javasm.demo.entity.Product;
import com.javasm.demo.entity.UserInfo;
import com.javasm.demo.util.DBUtil;

import java.sql.Connection;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 22:07
 * @description
 */
public class Test {
    public static void main(String[] args) throws Exception {
           demo();

    }

    private static void demo() throws Exception {
//        ProductDao productDao=new ProductDaoImpl();
//        Product product = productDao.findOneById(4);
        UserInfoDao userInfoDao=new UserInfoDaoImpl();
        UserInfo userInfo = userInfoDao.findOneById(4);
//        System.out.println(product);
        System.out.println(userInfo);
    }
}
