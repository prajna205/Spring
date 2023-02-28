package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVo;

public class RealTimeDITest {

	public static void main(String[] args) {
		// read i/p from enduser as string values
		Scanner sc= new Scanner(System.in);
		String name=null, addrs=null,pamt=null,rate=null,time=null;
		if (sc!=null) {
			System.out.println("Enter Customer name::");
			name=sc.next();
			System.out.println("Enter Customer address::");
			addrs=sc.next();
			System.out.println("Enter Principal amount::");
			pamt=sc.next();
			System.out.println("Enter Intrest rate ::");
			rate=sc.next();
			System.out.println("Enter Time (in  months)::");
			time=sc.next();
		}//if
		//prepare vo class obj having inputs
		CustomerVo vo = new CustomerVo();
		vo.setCname(name);
		vo.setCadd(addrs);
		vo.setPamt(pamt);
		vo.setRate(rate);
		vo.setTime(time);
		//create IOC container
		 DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		 XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get the controller class obj
		 MainController controller = factory.getBean("controller", MainController.class);
		 try {
			 //invoke the b.method
			 String resultMsg= controller.processCustomer(vo);
			 System.out.println(resultMsg);
		 }
		 catch (Exception e) {
			 System.err.println("Problem in customer registration::"+ e.getMessage());
			//e.printStackTrace();
		}
	}

}
