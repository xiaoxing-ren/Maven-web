package com.briup.ioc.staticFactory;

import java.util.Random;

public class StaticFactoryBean {

	public static Integer createRandom(){
		return new Integer(new Random().nextInt());
		
	}
	
	
	
}
