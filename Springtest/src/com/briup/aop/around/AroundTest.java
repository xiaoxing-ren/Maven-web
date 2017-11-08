package com.briup.aop.around;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.srevice.IAccountService;

public class AroundTest {

	@Test
	public void test(){
		
String path = "com/briup/aop/around/Around.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		IAccountService bean = (IAccountService) context.getBean("service");
		System.out.println(bean.getClass());
		bean.bankAction();
	}
}
