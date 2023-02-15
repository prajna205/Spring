package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator; 

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		
		//Hold the name and location of spring bean cfg file in resource object
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//create bean factory Spring container(IOC container)
		XmlBeanFactory factory = new XmlBeanFactory(res);
		//get target spring bean class obj injected with dependent spring bean class obj
		WishMessageGenerator generator = (WishMessageGenerator) factory.getBean("wmg");
		//invoke b.method
		String msg = generator.generateWishMessage("Praj");
		System.out.println(msg);
	}
}
