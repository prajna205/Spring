package com.nt.test;

import com.nt.comp.Person;
import com.nt.factory.PersonFactory;

public class FactoryPatternSolutionTest {
	public static void main(String[] args) {
		//use factory to create employee class obj
		Person emp = PersonFactory.getPerson("emp");
		System.out.println(emp);
		
		System.out.println("------------------------------------------");
		Person cust = PersonFactory.getPerson("cust");
		System.out.println(cust);
	}
}
