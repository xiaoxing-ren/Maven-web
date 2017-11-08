package com.briup.ioc.life;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Person;

public class life {

	@Test
	public void test(){
		String path = "com/briup/ioc/life/life.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Person bean = (Person) context.getBean("person");
		System.out.println(bean);
		System.out.println(bean);
//		System.out.println(context);
//		String beanName = bean.getBeanName();
//		System.out.println(beanName);
//		bean.findBean();
	}
	
}
