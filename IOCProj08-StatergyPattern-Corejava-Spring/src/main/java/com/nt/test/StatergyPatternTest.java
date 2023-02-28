package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comps.Flipkart;

public class StatergyPatternTest {
	public static void main(String[] args) throws Exception {
		//create IOC container
		DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("/com/nt/config/applicationContext.xml");
		//get target spring bean class obj
		Flipkart fkt= factory.getBean("fkt", Flipkart.class);
		//invoke b.method
		String msg= fkt.shopping(new String[] {"shirt", "pant","belt"},
														new double[] {1000.0,5000.0,500.0});
		System.out.println(msg);
	}
}
