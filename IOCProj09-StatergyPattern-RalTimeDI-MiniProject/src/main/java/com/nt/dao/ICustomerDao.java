package com.nt.dao;

import com.nt.bo.CustomerBo;

public interface ICustomerDao {
	public int insert(CustomerBo custBo) throws Exception;
}
