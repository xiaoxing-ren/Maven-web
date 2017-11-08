package com.briup.ioc.set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.Address;
import com.briup.bean.Person;

public class SetterTest {

	@Test
	public void ioc_setter(){
		String path = "com/briup/ioc/set/set.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		Address add = (Address) context.getBean("A");
		System.out.println(add);
		Person per = (Person) context.getBean("Person");
		System.out.println(per);
		add.helloword();
	} 
	
}
