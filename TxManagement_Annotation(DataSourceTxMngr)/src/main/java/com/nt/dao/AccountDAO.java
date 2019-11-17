package com.nt.dao;

public interface AccountDAO {

	public int withdraw(int acno,int amt);
	public int deposit(int acno,int amt);
}
