package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.AccountService;

public class DataSourceTransactionManagerTest {

	public static void main(String[] args) {

		ApplicationContext context = null;
		AccountService proxy = null;
		// create IOC Container
		context = new ClassPathXmlApplicationContext("/com/nt/cfgs/applicationContext.xml");
		// get proxy obj
		proxy = context.getBean("tpfb", AccountService.class);

		// invoke Bus method
		  proxy.transferMoney(3, 1, 25000);
	}

}
