package com.briup.ioc.coll;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.CollBean;

public class CollTest {

	@Test
	public void ioc_coll(){
		
		String path = "com/briup/ioc/coll/Coll.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		CollBean bean = (CollBean) context.getBean("Coll");
		List<String> lists = bean.getLists();
		System.out.println(lists);
		System.out.println(bean);
		
	}
}
