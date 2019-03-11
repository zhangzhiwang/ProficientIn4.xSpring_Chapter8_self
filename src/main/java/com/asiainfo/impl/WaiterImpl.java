package com.asiainfo.impl;

import org.springframework.stereotype.Component;

import com.asiainfo.ZzwAnnotation;
import com.asiainfo.interfaces.IWaiter;

/**
 * 服务生实现类
 *
 * @author zhangzhiwang
 * @date 2019年3月3日 下午3:23:02
 */
@Component("waiterImpl")
@ZzwAnnotation
public class WaiterImpl implements IWaiter {
	public int greetTo(String name) {
		System.out.println("greetTo " + name);
//		if("zzw".equals(name)) {
//			String[] ss = new String[] {};
//			System.out.println(ss[0]);
//		} else {
//			double d = 1/0;
//		}
		return 123321;
	}

	public void serveTo(String name) {
		System.out.println("serve to " + name);
	}

	public String met1(String name, IWaiter waiter) {
		System.out.println("WaiterImpl#met1(" + name + ")");
		return "aabbcc";
	}
}
