package com.briup.theory.aop.Cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
public class CglibBookService implements MethodInterceptor {

	public Object getInstance(Class<?> c){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(c);
		enhancer.setCallback(this);	
		return enhancer.create();
	}
	
	
	@Override
	public Object intercept(Object obj, Method method, Object[] arg, MethodProxy proxy) throws Throwable {
		
		System.out.println(method.getName()+"开始");
		Object invoke = proxy.invokeSuper(obj, arg);
		System.out.println(method.getName()+"结束");
		
		return invoke;
	}

}
