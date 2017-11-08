package com.briup.ioc.instanceFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InstanceFactoryBean {

	private String format;

	
	
	public InstanceFactoryBean() {
		
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
	public String createTime(){
		
		return new SimpleDateFormat(format).format(new Date());
	}

	
	
}
