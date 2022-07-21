package com.javasm.demo.dao;

import java.util.List;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 22:10
 * @description
 */
public interface BaseDao<E> {
    public E findOneById(int id) throws Exception;
    List<E> findList() throws Exception;
}
