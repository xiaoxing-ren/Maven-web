package com.briup.ioc.event;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListenterTest {

	@Test
	public void test(){
		String path ="com/briup/ioc/event/listenter.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		context.publishEvent(new RaimEvent("中国队赢了"));
		
		
	}
}
