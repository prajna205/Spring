package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class JavaConfigAppTest {

	public static void main(String[] args) {
		// create IOC container
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);		
		//get target spring bean obj ref
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		//invoke b.method
		String result=generator.generateWishMessage("prajna");
		System.out.println(result);

		//close container
		ctx.close();
	}

}
