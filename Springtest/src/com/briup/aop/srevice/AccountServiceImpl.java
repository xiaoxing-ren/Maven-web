package com.briup.aop.srevice;

import javax.annotation.Resource;

import com.briup.aop.Dao.AccountDao;
import com.briup.aop.pojo.Account;


/**
 * 目标类
 * */
public class AccountServiceImpl implements IAccountService {

	private Account account;
	private AccountDao accountDao;
	
	@Override
	public void bankAction() {
		accountDao.withdraw(account, 1000);
		accountDao.deposit(account, 1212);
	//	throw new RuntimeException("差不多吃饭了！");
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}
	
	
	@Resource(name="dao")
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

//	@Override
//	public String toString() {
//		return "AccountServiceImpl [account=" + account + ", accountDao=" + accountDao + "]";
//	}

	
}
