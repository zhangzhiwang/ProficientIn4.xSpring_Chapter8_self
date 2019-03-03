package com.asiainfo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 通过@AspectJ来定义切面
 *
 * @author zhangzhiwang
 * @date 2019年3月3日 下午2:36:54
 */
@Component("myAspectJ")
@Aspect // @Aspect注解标识该类为切面类,既然是切面就要有切点和增强
public class MyAspectJ {
	@Before("execution(* greetTo(..))")  // @Before定义了方位信息,里面的表达式定义了切点信息
	public void beforeGreeting() {// 增强的横切逻辑
		System.out.println("先打招呼...");
	}
}