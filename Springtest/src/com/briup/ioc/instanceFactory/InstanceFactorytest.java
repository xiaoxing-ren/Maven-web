package com.briup.ioc.instanceFactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceFactorytest {

	@Test
	public void test(){
		String path = "com/briup/ioc/instanceFactory/InstanceFactory.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		String bean = (String) context.getBean("string");
		
		System.out.println(bean);
	}
}
