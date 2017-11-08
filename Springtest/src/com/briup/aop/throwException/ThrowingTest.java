package com.briup.aop.throwException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.srevice.IAccountService;

public class ThrowingTest {

	@Test
	public void test(){
		String path = "com/briup/aop/throwException/throwing.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		IAccountService bean = (IAccountService) context.getBean("proxy");
		System.out.println(bean.getClass());
		bean.bankAction();
		
	}
}
