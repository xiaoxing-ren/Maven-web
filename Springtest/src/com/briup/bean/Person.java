package com.briup.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class Person implements BeanNameAware,BeanFactoryAware{
	
	private int sNo;
	private String name;
	private boolean gender;
	private int age;
	private Address address;
	
	private String beanName;
	private BeanFactory beanFactory;
	
	
	public Person() {
		System.out.println("创建");
	}

	public void init(){
		System.out.println("初始化");
	}
	public void destory(){
		System.out.println("销毁");
	}
	
	public Person(Address address) {
		
		this.address = address;
	}

	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [sNo=" + sNo + ", name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address
				+ "]";
	}

	

	public String getBeanName() {
		return beanName;
	}

	@Override
	public void setBeanName(String beanName) {
		
		this.beanName=beanName;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		this.beanFactory=beanFactory;
		
	}
	
	public void findBean(){
		DateBean bean = (DateBean) beanFactory.getBean("date");
		System.out.println(bean.getSecs()); 
		System.out.println(bean.getClass());
	}
	
}
