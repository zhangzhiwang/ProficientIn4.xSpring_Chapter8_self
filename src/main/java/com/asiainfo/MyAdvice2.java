package com.asiainfo;

/**
 * 增强
 *
 * @author zhangzhiwang
 * @date Mar 9, 2019 5:45:25 PM
 */
public class MyAdvice2 {
	public void after(int rv) {
		System.out.println("...after:" + rv);
	}
}
