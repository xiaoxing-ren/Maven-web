package com.briup.aop.autoProxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.srevice.IAccountService;

public class AutoProxy {

	@Test
	public void test(){
		
		String path = "com/briup/aop/autoProxy/autoProxy.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		IAccountService bean = (IAccountService) context.getBean("target1");		
		bean.bankAction();
		
		String string = bean.toString();
		System.out.println(bean.getClass());
		System.out.println(context.getBean("Dao").getClass());
//		System.out.println(string+" toString方法执行了");
		
	}
	
}
