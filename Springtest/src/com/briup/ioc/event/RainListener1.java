package com.briup.ioc.event;

import org.springframework.context.ApplicationListener;

public class RainListener1 implements ApplicationListener<RaimEvent>{

	@Override
	public void onApplicationEvent(RaimEvent event) {
		if(event instanceof RaimEvent){
			System.out.println("666");
			
		}
		
	}

	

}
