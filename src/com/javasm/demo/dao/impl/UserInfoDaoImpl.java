package com.javasm.demo.dao.impl;

import com.javasm.demo.dao.UserInfoDao;
import com.javasm.demo.entity.UserInfo;

import java.util.List;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 22:14
 * @description
 */
public class UserInfoDaoImpl extends BaseDaoImpl<UserInfo> implements UserInfoDao {
    public UserInfoDaoImpl() {
        super(UserInfo.class);
    }
}
