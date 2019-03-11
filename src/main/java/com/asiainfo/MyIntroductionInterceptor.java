package com.asiainfo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * 基于@AspectJ的引介增强
 *
 * @author zhangzhiwang
 * @date 2019年3月5日 上午10:18:16
 */
//@Component
//@Aspect// 标注该类是一个切面类
public class MyIntroductionInterceptor {// 如果不使用@AspaectJ，那么实现引介增强的切面类要实现IntroductionInterceptor
//	// @DeclareParents声明引介增强，目的是让WaiterImpl（目标类）去实现IUserService（目标类未实现的接口）
//	@DeclareParents(value="com.asiainfo.impl.WaiterImpl", // 目标类，有引介增强的的切点是类级别的，所以value属性在定义切点的时候要为目标类的全限定名。
//			defaultImpl=UserServiceImpl.class)// 目标类所要实现的接口的默认实现类，该类已经实现了接口
//	public IUserService userService;// 目标类要实现的接口
}
