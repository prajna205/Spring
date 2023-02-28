package com.nt.controller;

import com.nt.dto.CustomerDto;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVo;

public class MainController {
//Has-A property
	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController: 1-param constructor");
		 this.service=service;
	}
	
	public String processCustomer(CustomerVo vo) throws Exception {
		//convert vo class obj to DTO class obj
		CustomerDto custoDTO = new CustomerDto();
		custoDTO.setCname(vo.getCname());
		custoDTO.setCadd(vo.getCadd());
		custoDTO.setPamt(Double.parseDouble(vo.getPamt()));
		custoDTO.setTime(Double.parseDouble(vo.getTime()));
		custoDTO.setRate(Double.parseDouble(vo.getRate()));
		//use service
		String resultMsg = service.RegisterCustomer(custoDTO);
		return resultMsg;
	}
	
	
}
