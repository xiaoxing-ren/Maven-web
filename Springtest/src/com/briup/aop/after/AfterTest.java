package com.briup.aop.after;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.srevice.IAccountService;

public class AfterTest {

	@Test
	public void test(){
		String path ="com/briup/aop/after/afterAdvice.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		IAccountService bean = (IAccountService) context.getBean("proxy");
		System.out.println(bean.getClass());
		
		
	}
}
