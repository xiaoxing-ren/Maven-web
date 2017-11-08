package com.briup.ioc.proEdit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class proEdtTest {

	@Test
	public void test(){
		String path="com/briup/ioc/proEdit/plug.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
//		User bean = (User) context.getBean("user");
//		
//		System.out.println(bean);
		
		
	}
}
