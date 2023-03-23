package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

public class MethodInjectionTest {

	public static void main(String[] args) {
//create IOC container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get the target class obj ref
		BankService service = ctx.getBean("bankService",BankService.class);
		//invoke b.method
		double res= service.calculateInterstAmount(10000, 12, 2);
		System.out.println(res);
		//close container
		ctx.close();
	}

}
