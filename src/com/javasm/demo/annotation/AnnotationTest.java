package com.javasm.demo.annotation;

import com.alibaba.druid.support.http.WebStatFilter;
import lombok.Data;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 23:04
 * @description
 */
@Data
@MyAnnotation(id = 100,name = "liqwe",hobby = {"123","456"})
public class AnnotationTest {
    private int id;
    private String name;
    private String[] hobby;
    @MyAnnotation(id = 101,name = "liqwe",hobby = {"123","456"})
    public void test() {

    }
}
