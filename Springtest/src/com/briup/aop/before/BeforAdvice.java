package com.briup.aop.before;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.briup.aop.aspect.MyLogger;

public class BeforAdvice implements MethodBeforeAdvice{
	private MyLogger log;
	
	
	
	public MyLogger getLog() {
		return log;
	}



	public void setLog(MyLogger log) {
		this.log = log;
	}

	@Override
	public void before(Method method, Object[] arg1, Object target) throws Throwable {
		log.log(method.getName()+"开始执行");
		//spring 会自动处理 反射调用对象，不能再手动调用，否则会调用两次
		
	}

	
}
