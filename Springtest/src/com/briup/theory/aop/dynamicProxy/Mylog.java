package com.briup.theory.aop.dynamicProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mylog {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	public void log(String msg){
		
		System.out.println(dateFormat.format(new Date())+" log: "+msg);
	}
//	public static void main(String[] args) {
//		Mylog log = new Mylog();
//		log.log("hello");
//	}
}
