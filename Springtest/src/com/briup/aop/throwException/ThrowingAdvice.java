package com.briup.aop.throwException;

import org.springframework.aop.ThrowsAdvice;

import com.briup.aop.aspect.MyLogger;

public class ThrowingAdvice implements ThrowsAdvice {
	
	private MyLogger log;

	public MyLogger getLog() {
		return log;
	}

	public void setLog(MyLogger log) {
		this.log = log;
	}
	
	public void afterThrowing(Exception e){
		log.log(e.getMessage()+"出错了");
		
	}
	
}
