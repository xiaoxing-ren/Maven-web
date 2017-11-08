package com.briup.ioc.factory;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanimpl implements FactoryBean<Double> {

	@Override
	public Double getObject() throws Exception {
		
		return 36d;
	}

	@Override
	public Class<Double> getObjectType() {
		// TODO Auto-generated method stub
		return Double.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
