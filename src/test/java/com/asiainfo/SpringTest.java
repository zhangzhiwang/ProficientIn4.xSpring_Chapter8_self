package com.asiainfo;

import java.lang.reflect.Method;

import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.impl.WaiterImpl;
import com.asiainfo.impl.WaiterImplExt;
import com.asiainfo.interfaces.IUserService;


public class SpringTest {

	@Test
	public void test() {
		Class clazz = UserServiceImpl.class;
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			ZzwAnnotation annotation = method.getAnnotation(ZzwAnnotation.class);
			System.out.println(annotation.value());
		}
	}

	@Test
	public void testMyAspectJ() {
		AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory();
		aspectJProxyFactory.setTarget(new WaiterImpl());
		aspectJProxyFactory.addAspect(MyAspectJ.class);
		WaiterImpl proxy = aspectJProxyFactory.getProxy();
		proxy.greetTo("zzw");
		proxy.serveTo("zzw");
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		Object bean = applicationContext.getBean("waiterImpl");
		WaiterImpl waiterImpl = (WaiterImpl) bean;
		System.out.println("----------------");
		waiterImpl.greetTo("zzw1");
		waiterImpl.serveTo("abc");
		waiterImpl.met1("zzw", waiterImpl);
//		IUserService u  = (IUserService) bean;
//		u.met1("", null);
		
//		Object bean = applicationContext.getBean("userServiceImpl");
//		UserServiceImpl waiterImpl = (UserServiceImpl) bean;
//		waiterImpl.met1("zzw", new WaiterImpl());
		
		
	}
}
