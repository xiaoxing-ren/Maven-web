package com.briup.aop.xml;

import java.nio.channels.Pipe;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlHandle  {

	public void beforeTest(JoinPoint p){
		System.out.println(p.getSignature().getName()+" before...");
	}
	
	
	public void afterTest(JoinPoint p){
		System.out.println(p.getSignature().getName()+" after...");
	}
	
	public void afterReturningTest(JoinPoint p){
		
		System.out.println(p.getSignature().getName()+" afterReturning");
		
	}
	
	public Object aroundTest(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println(pjp.getSignature().getName()+"开始");
		Object proceed = pjp.proceed();
		
		System.out.println(pjp.getSignature().getName()+"结束");
		
		return proceed;
	}
	public void throwingTest(JoinPoint p,Exception ex){
		System.out.println(p.getSignature().getName()+" is throwing..."+ex.getMessage());
		
	}
	
	
}
