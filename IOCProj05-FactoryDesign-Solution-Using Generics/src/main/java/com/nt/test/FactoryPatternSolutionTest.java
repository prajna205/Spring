package com.nt.test;

import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.factory.PersonFactory;

public class FactoryPatternSolutionTest {
	public static void main(String[] args) {
		try {
			//use factory to create employee class obj
			Employee emp = PersonFactory.getPerson(Employee.class);
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("------------------------------------------");
		try {
			//use factory to create employee class obj
			Customer emp = PersonFactory.getPerson(Customer.class);
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
