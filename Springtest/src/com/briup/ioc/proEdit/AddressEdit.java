package com.briup.ioc.proEdit;

import java.beans.PropertyEditorSupport;


public class AddressEdit extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] str = text.split(":");
		String city =str[0];
		int zip =Integer.parseInt(str[1]);
		String street = str[2];
		
		Address add = new Address(city,zip,street);
		setValue(add);
	}
}
