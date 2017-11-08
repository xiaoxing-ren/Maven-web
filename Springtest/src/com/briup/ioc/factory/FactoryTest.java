package com.briup.ioc.factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {

	@Test
	public void test(){
		String path = "com/briup/ioc/factory/factroy.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Double bean = (Double) context.getBean("dou");
		System.out.println(bean);
		System.out.println(bean.getClass()); 
		
	}
}
