package com.javasm.demo.entity;

import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 21:55
 * @description
 */
@Data
public class Product {
    private Integer id;
    private String prodName;
    private BigDecimal prodPrice;
    private Integer prodStore;
    private Integer prodStatus;
    private String prodImage;
    private String prodDesc;
    private LocalDateTime createTime;
    private DateTime updateTime;
}
