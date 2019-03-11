package com.asiainfo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * 
 * @author zhangzhiwang
 * @date 2019年3月1日 下午3:06:18
 */
@Retention(RetentionPolicy.RUNTIME) //注解的保留期限，详见课本p272
@Target({ElementType.METHOD, ElementType.TYPE})// 可以适用该注解的目标类型
public @interface ZzwAnnotation {// 用@Interface标识该类为注解类
	boolean value() default false;// 声明成员变量
}
