package com.javasm.demo.entity;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 21:44
 * @description
 */
@Data
public class UserInfo {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String image;
    private String birthday;
    private Date lastLoginTime;
    private Date createTime;
    private Date updateTime;
    private Integer rid;
}
