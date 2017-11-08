package com.briup.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.ioc.annotation.Boss;

public class AnnotationTest {

	@Test
	public void test(){
		try {
			String path = "com/briup/ioc/annotation/annotation.xml";
			ClassPathXmlApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			
			Boss boss = (Boss)container.getBean("boss");
//			Car bean = (Car) container.getBean("car");
//			System.out.println(boss.getCar());
//			System.out.println(boss.getOffice().getNum());
//			boss.destory();
//			System.out.println(boss.getOffice());
//			System.out.println(boss.getCar());
//			System.out.println(boss.getCar().getName());
//			System.out.println(boss.getCar().getPrice());
			
			
//			container.destroy();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}