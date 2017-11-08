package com.briup.ioc.autowired;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Person;

public class WiredTest {

	@Test
	public void wiredtest(){
		String path = "com/briup/ioc/autowired/autowired.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		System.out.println(context);
		Person bean = (Person)context.getBean("Person");
//		System.out.println(bean.getClass());
//		System.out.println(bean);
//		System.out.println(bean.getAddress());
	}
}
