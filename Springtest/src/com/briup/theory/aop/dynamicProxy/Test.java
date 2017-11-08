package com.briup.theory.aop.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
IStudentService target = new StudentServiceImpl();
		
		//类加载器
		ClassLoader loader = target.getClass().getClassLoader();
		//实现的接口
		Class<?>[] interfaces = target.getClass().getInterfaces();
		//
		InvocationHandler h = new MyHandler(target);
		
		//代理对象
		IStudentService proxy = (IStudentService)Proxy.newProxyInstance(loader, interfaces, h);
		
		proxy.delete(1);
	}
}
