package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("accdao")
public class AccountDAOImpl implements AccountDAO {

	private static final String WITHDRAW_QUERY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE-? WHERE ACCNO=?";
	private static final String DEPOSIT_QUERY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE+? WHERE ACCNO=?";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public AccountDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int withdraw(int acno, int amt) {
		int count=jdbcTemplate.update(WITHDRAW_QUERY,amt,acno);
		return count ;
	}

	@Override
	public int deposit(int acno, int amt) {
		int count=jdbcTemplate.update(DEPOSIT_QUERY,amt,acno);
		return count ;
	}

}
