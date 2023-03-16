 package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Employee;

public class PropertiedFileTest {

	public static void main(String[] args) {
		//create application context container
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get spring bean class obj
		Employee emp=ctx.getBean("emp",Employee.class);
		//display employee data
		System.out.println("emp data"+emp);
		//close container
		ctx.close();
	}

}
