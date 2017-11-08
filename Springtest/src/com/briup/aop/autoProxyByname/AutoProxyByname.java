package com.briup.aop.autoProxyByname;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.srevice.IAccountService;

public class AutoProxyByname {

	@Test
	public void test(){
		String path ="com/briup/aop/autoProxyByname/autoProxyByname.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		IAccountService bean = (IAccountService) context.getBean("target");
		bean.bankAction();
		System.out.println(bean.getClass());
	}
	
}
