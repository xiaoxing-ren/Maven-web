package com.briup.theory.ioc;

public class IOCTest {
	public static void main(String[] args) {
		
		BeanFactory container = new BeanFactory();
		
		Teacher t = (Teacher)container.getBean("t");
		
		System.out.println(t);
		System.out.println(t.getStudent());
	}
}
