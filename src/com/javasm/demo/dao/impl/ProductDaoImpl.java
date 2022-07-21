package com.javasm.demo.dao.impl;

import com.javasm.demo.dao.BaseDao;
import com.javasm.demo.dao.ProductDao;
import com.javasm.demo.entity.Product;

import java.util.List;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 22:14
 * @description
 */
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao {


    public ProductDaoImpl() {
        super(Product.class);
    }
}
