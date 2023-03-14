package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StreoTypeAnnotationsTest {

	public static void main(String[] args) {
		//create ApplicationContext Container
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
//get target spring bean class obj
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke b.method
		String msg=fpkt.shopping(new String[]{"shirts", "trousers","belt"}, 
														new double[] {1000.0,3000.0,500.0});
		System.out.println(msg);
	}

}
