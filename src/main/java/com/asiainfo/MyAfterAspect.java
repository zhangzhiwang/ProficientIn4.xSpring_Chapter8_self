package com.asiainfo;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Aspect
//@Component	// 注：切面类必须标识为一个bean，要么使用注解要么配置在xml里
public class MyAfterAspect {
//	@AfterReturning("@annotation(com.asiainfo.ZzwAnnotation)")// 切点为所有类标注了@ZzwAnnotation注解的方法
//	public void after() {
//		System.out.println("方法执行完了!");
//	}
}
