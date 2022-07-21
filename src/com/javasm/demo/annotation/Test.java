package com.javasm.demo.annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 23:01
 * @description
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Class<AnnotationTest> testClass = AnnotationTest.class;
        AnnotationTest newInstance = testClass.getConstructor().newInstance();
        MyAnnotation annotation = testClass.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.id());
        System.out.println(Arrays.toString(annotation.hobby()));
        System.out.println(annotation.name());
        AnnotationTest annotationTest = new AnnotationTest();
        annotationTest.setHobby(annotation.hobby());
        System.out.println(annotationTest);
    }
}
