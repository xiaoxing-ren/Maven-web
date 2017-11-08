package com.briup.ioc.event;

import org.springframework.context.ApplicationEvent;

public class RaimEvent extends ApplicationEvent{

	public RaimEvent(Object source) {
		super(source);
	}

}
