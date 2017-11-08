package com.briup.aop.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.srevice.IAccountService;

public class XmlHandleTest {

	@Test
	public void test(){
		String path ="com/briup/aop/xml/xmlHandle.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		IAccountService bean = (IAccountService) context.getBean("srevice");
		bean.bankAction();
		
	}
}
