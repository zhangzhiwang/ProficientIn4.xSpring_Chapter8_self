package com.asiainfo.impl;

import org.springframework.stereotype.Component;

import com.asiainfo.interfaces.IWaiter;

/**
 * 服务生实现类
 *
 * @author zhangzhiwang
 * @date 2019年3月3日 下午3:23:02
 */
@Component("waiterImplExt")
public class WaiterImplExt extends WaiterImpl {
	public int greetTo(String name) {
		System.out.println("greetTo*** " + name);
		return 1;
	}

	public void serveTo(String name) {
		System.out.println("serve to*** " + name);
	}

	public String met1(String name, IWaiter waiter) {
		System.out.println("WaiterImpl#met1***(" + name + ")");
		return "";
	}
	
	public void mmm() {
		System.out.println("mmm");
	}
}
