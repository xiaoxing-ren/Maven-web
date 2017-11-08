package com.briup.ioc.imp;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Person;

public class impTest {

	@Test
	public void test(){
		//String path = "com/briup/ioc/imp/import.xml";
		String[] path={"com/briup/ioc/imp/A.xml","com/briup/ioc/imp/B.xml"};
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
		Person bean = (Person) context.getBean("per");
		System.out.println(bean);
	}
}
