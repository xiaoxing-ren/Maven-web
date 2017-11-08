package com.briup.aop.Dao;

import com.briup.aop.pojo.Account;

public class AccountDaoImpl implements AccountDao {

	@Override
	public void withdraw(Account acc, double amt) {
		System.out.println(acc.getName()+"取出成功"+amt);
		
	}

	@Override
	public void deposit(Account acc, double amt) {
		System.out.println(acc.getName()+"存入成功"+amt);
		
	}

}
