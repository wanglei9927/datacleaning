package com.zy.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//Target指定此注解作用范围，如果没有指定，作用范围是任何元素上
@Retention(RetentionPolicy.RUNTIME)//约束注解的生命周期，1.源码：编译期丢弃，2.class，3.runtime
public @interface AnnotationElementDemo {
	
	//枚举类型
    enum Status {FIXED,NORMAL};

    //声明枚举
    Status status() default Status.FIXED;
    
    //布尔类型
    boolean showSupport() default false;
    //String类型
    String name()default "";
  //class类型
    Class<?> testCase() default Void.class;

    //注解嵌套
    Reference reference() default @Reference(next=true);
    
    //数组类型
    long[] value();
}
@interface Reference{
    boolean next() default false;
}