package com.briup.aop.Dao;

import com.briup.aop.pojo.Account;

public interface AccountDao {

	/**
	 * 取出
	 * */
	void  withdraw(Account acc,double amt);
	/**
	 * 存入
	 * */
	void  deposit(Account acc,double amt);
	
}
