package com.briup.theory.aop.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

	private Object stu;
	private Mylog log = new Mylog();
	
	
	public MyHandler(Object stu) {
		
		this.stu = stu;
	}

	@Override
	public Object invoke(Object proxy, Method mathod, Object[] arg2) throws Throwable {
		
		log.log(mathod.getName()+"开始");
		Object invoke = mathod.invoke(stu,arg2);
		
		
		return invoke;
	}
	
	
}
