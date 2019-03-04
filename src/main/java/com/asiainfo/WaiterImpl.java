package com.asiainfo;

import org.springframework.stereotype.Component;

/**
 * 服务生实现类
 *
 * @author zhangzhiwang
 * @date 2019年3月3日 下午3:23:02
 */
@Component("waiterImpl")
public class WaiterImpl {
	public void greetTo(String name) {
		System.out.println("greetTo " + name);
	}
	
	public void serveTo(String name) {
		System.out.println("serve to " + name);
	}
	
	public static void main(String[] args) {
		WaiterImpl w = new WaiterImpl();
		System.out.println(w.getClass().getSuperclass());
	}
}
