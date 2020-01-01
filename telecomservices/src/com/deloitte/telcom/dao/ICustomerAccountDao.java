package com.deloitte.telcom.dao;

import com.deloitte.telcom.entities.CustomerAccount;

public interface ICustomerAccountDao {
	void addCustomer(CustomerAccount c);
	CustomerAccount findCustomerByMobNo(String mobNo);
	void rechargeAccount(CustomerAccount ac,double addBalance);
	//Set<CustomerAccount> allCustomers();
}
