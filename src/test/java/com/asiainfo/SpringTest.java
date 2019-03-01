package com.asiainfo;

import java.lang.reflect.Method;

import org.junit.Test;

public class SpringTest {

	@Test
	public void test() {
		Class clazz = UserServiceImpl.class;
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for(Method method : declaredMethods) {
			ZzwAnnotation annotation = method.getAnnotation(ZzwAnnotation.class);
			System.out.println(annotation.value());
		}
	}

}
