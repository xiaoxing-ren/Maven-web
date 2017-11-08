package com.briup.ioc.staticFactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomTest {
	
	@Test
	public void test(){
		String path="com/briup/ioc/staticFactory/StaticFactoryBean.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Integer bean = (Integer) context.getBean("sfbrm");
		System.out.println(bean);
		
		
	}
}
