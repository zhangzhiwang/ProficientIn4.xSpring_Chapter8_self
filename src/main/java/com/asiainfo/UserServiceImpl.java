package com.asiainfo;

import org.springframework.stereotype.Component;

import com.asiainfo.interfaces.IUserService;
import com.asiainfo.interfaces.IWaiter;

@Component
public class UserServiceImpl implements IUserService {
//	@ZzwAnnotation(true)
	public void met1(String name, IWaiter waiter) {
		System.out.println("UserServiceImpl#met1()");
	}
}
