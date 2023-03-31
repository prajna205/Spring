package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.IEmployeeMgmtService;

public class JDBCTemplateTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get spring bean class obj
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		try {
			System.out.println("Employee count ::"+ service.fetcgEmpsCount());
			System.out.println("Employee Name:: "+ service.fetchEmpName(7566));
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		ctx.close();
	}
}
