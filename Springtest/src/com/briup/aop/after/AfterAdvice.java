package com.briup.aop.after;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.briup.aop.aspect.MyLogger;

/**
 * 后置通知正常执行完
 * */
public class AfterAdvice implements AfterReturningAdvice {
	
	private MyLogger log;
	
	public MyLogger getLog() {
		return log;
	}
	
	public void setLog(MyLogger log) {
		this.log = log;
	}

	@Override
	public void afterReturning(Object returnValue, Method math, Object[] arg2, Object target) throws Throwable {

		log.log(math.getName()+ ";正常关闭"+"===="+";returnValue===="+returnValue+";arg2==="+arg2+";target"+target);
		
	}

}
