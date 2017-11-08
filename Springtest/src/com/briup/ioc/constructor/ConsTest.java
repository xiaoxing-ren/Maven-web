package com.briup.ioc.constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.DateBean;

public class ConsTest {

	@Test
	public void ioc_cons(){
		String path ="com/briup/ioc/constructor/constructor.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		DateBean bean = (DateBean) context.getBean("Date");
		
		System.out.println(bean);
	}
}
