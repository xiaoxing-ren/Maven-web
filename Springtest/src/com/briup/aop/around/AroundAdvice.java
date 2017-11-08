package com.briup.aop.around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.briup.aop.aspect.MyLogger;

public class AroundAdvice implements MethodInterceptor {

	private MyLogger log;
	
	public MyLogger getLog() {
		return log;
	}

	public void setLog(MyLogger log) {
		this.log = log;
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		log.log(invocation.getMethod().getName()+"前置"+"..");
		Object proceed = invocation.proceed();
		log.log(invocation.getMethod().getClass()+"后置");
		
		return proceed;
	}

	
}
