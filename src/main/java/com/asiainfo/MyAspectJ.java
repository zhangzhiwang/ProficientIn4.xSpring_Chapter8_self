package com.asiainfo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.asiainfo.impl.WaiterImpl;
import com.asiainfo.interfaces.IUserService;
import com.asiainfo.interfaces.IWaiter;

/**
 * 通过@AspectJ来定义切面
 *
 * @author zhangzhiwang
 * @date 2019年3月3日 下午2:36:54
 */
@Component("myAspectJ")
@Aspect // @Aspect注解标识该类为切面类,既然是切面就要有切点和增强
public class MyAspectJ implements Ordered{
//	@Before("execution(* greetTo(..))")  // @Before定义了方位信息,里面的表达式定义了切点信息
//	public void beforeGreeting() {// 增强的横切逻辑
//		System.out.println("先打招呼...");
//	}
	
	// 各种基于@AspectJ的切点表达式详见课本p285
//	@Before("execution(* com.asiainfo.*.*(..))")
//	public void before() {
//		System.out.println("目标方法执行前织入的逻辑");
//	}
	
	// 复合切点
//	@Before("execution(* *(..)) && !execution(* com..*.serveTo(..))")
//	public void before() {
//		System.out.println("复合切点");
//	}
	
	// 对切点进行命名
//	@Pointcut("execution(* *(..)) && !execution(* com..*.serveTo(..))")
//	public void notServeToPointcut() {}
	
//	@Before("MyAspectJ.notServeToPointcut() && execution(String *(..))")
//	public void before() {
//		System.out.println("命名切点");
//	}
	
	//增强的织入顺序
//	@Before("execution(* *(..))")
//	public void before1() {
//		System.out.println(1);
//	}
//	
//	@Before("execution(String *(..))")
//	public void before2() {
//		System.out.println(2);
//	}
//	
//	@Before("execution(* com.asiainfo..*.met1(..))")
//	public void before3() {
//		System.out.println(3);
//	}
//
	public int getOrder() {
		return 100;
	}
	
	// 访问连接点信息
//	@Around("execution(* met1(..))")
//	public void before(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//		System.out.println("增强逻辑开始...");
//		Object[] args = proceedingJoinPoint.getArgs();
//		System.out.println("运行时连接点的入參列表：" + args[0]);//注意鄙视入參类型列表，而是运行时实际的入參（实參）列表
//		Signature signature = proceedingJoinPoint.getSignature();
//		System.out.println("连接点的方法签名为：" + signature.toLongString());
//		Object target = proceedingJoinPoint.getTarget();
//		System.out.println("连接点方法所属的目标对象为：" + target);
//		Object this1 = proceedingJoinPoint.getThis();
//		System.out.println("代理对象为：" + this1);
//		proceedingJoinPoint.proceed(new Object[]{"aaa"});
//	}
	
//	@Before("args(name,waiter)")
//	public void before(IWaiter waiter, String name) {
//		System.out.println("args...");
//		System.out.println(waiter.toString());
//		System.out.println(name);
//	}
	
	//匹配目标类，目标类是否是targer函数指定的类及其子类
//	@Before("target(com.asiainfo.interfaces.IUserService)")
//	public void before() {
//		System.out.println("target...");
//	}
	
	//匹配目标类，代理类是否是this函数指定的类及其子类，区别在于引介增强时目标类的代理实现了目标类并为实现的接口
//	@AfterReturning("this(com.asiainfo.interfaces.IUserService)")
//	public void before() {
//		System.out.println("this()...");
//	}
	
//	@Before("this(aaa)")
//	public void before(IUserService aaa) {
//		System.out.println(aaa.getClass().getName());
//	}
	
	//匹配目标类，不包括子类
//	@Before("within(com.asiainfo.impl.WaiterImpl)")
//	public void before() {
//		System.out.println("within...");
//	}
	
//	@Before("execution(* com.asiainfo.impl.WaiterImpl.*(..))")
//	public void before() {
//		System.err.println("execution...");
//	}
	
//	@Before("@within(com.asiainfo.ZzwAnnotation)")
//	@Before("@target(bbb)")
//	public void before(ZzwAnnotation bbb) {
//		System.out.println("anno...");
//		System.out.println(bbb.getClass().getName());
//	}
	
	// 绑定返回值
//	@AfterReturning(value="target(com.asiainfo.impl.WaiterImpl)", returning="ccc")
//	public void before(int ccc) {
//		System.out.println("ccc = "+ ccc);
//	}
	
	// 绑定抛出的异常
//	@AfterThrowing(value="target(com.asiainfo.impl.WaiterImpl)", throwing="ddd")
//	public void before(ArrayIndexOutOfBoundsException ddd) {
//		System.out.println("ddd = " + ddd.getMessage());
//	}
}