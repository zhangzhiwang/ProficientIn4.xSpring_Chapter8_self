package com.asiainfo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.asiainfo.interfaces.IUserService;

/**
 * 通过@AspectJ来定义切面
 *
 * @author zhangzhiwang
 * @date 2019年3月3日 下午2:36:54
 */
@Component("myAspectJ2")
@Aspect // @Aspect注解标识该类为切面类,既然是切面就要有切点和增强
public class MyAspectJ2 implements Ordered{
	//定义一个引介增强
		@DeclareParents(value="com.asiainfo.impl.WaiterImpl", defaultImpl=UserServiceImpl.class)
		private IUserService userService;
	
	//增强的织入顺序
//	@Before("execution(* *(..))")
//	public void before4() {
//		System.out.println(4);
//	}
//
	public int getOrder() {
		return 20;
	}
	
//	@Before("execution(String *(..))")
//	public void before2() {
//		System.out.println(2);
//	}
//	
//	@Before("execution(* com.asiainfo..*.met1(..))")
//	public void before3() {
//		System.out.println(3);
//	}
}