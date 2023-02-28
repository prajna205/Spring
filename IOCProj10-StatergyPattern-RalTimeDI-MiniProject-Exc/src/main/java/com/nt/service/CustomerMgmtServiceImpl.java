package com.nt.service;

import com.nt.bo.CustomerBo;
import com.nt.dao.ICustomerDao;
import com.nt.dto.CustomerDto;

public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	//HAS-A property
	private ICustomerDao dao;
	
	public CustomerMgmtServiceImpl(ICustomerDao dao) {
		System.out.println("CustomerMgmtServiceImpl.::1-param constructor");
		this.dao = dao;
	}

	@Override
	public String RegisterCustomer(CustomerDto dto) throws Exception {
		System.out.println("CustomerMgmtServiceImpl.RegisterCustomer()");
		//write  business logic to calculate intrest amount
		double intamt= (dto.getPamt()*dto.getTime()*dto.getRate())/100.0;
		//prepare CustomerBo class obj having persistable data
		CustomerBo custBo=new CustomerBo();
		custBo.setCname(dto.getCname());
		custBo.setCadd(dto.getCadd());
		custBo.setPamt(dto.getPamt());
		custBo.setIntramt(intamt);
		//use DAO
		int count = dao.insert(custBo);
		//process the result
		return count==0? "Regestration failed":"Regestration successfull and intrest amount is "+intamt;
	}

}
