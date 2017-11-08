package com.briup.aop.advices;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.srevice.IAccountService;

public class AdvicesTest {

	@Test
	public void test(){
		String path = "com/briup/aop/advices/advices.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		IAccountService bean = (IAccountService) context.getBean("proxy");
		
		bean.bankAction();
		String string = bean.toString();
		System.out.println(string+" toString方法执行了");
	}
}
