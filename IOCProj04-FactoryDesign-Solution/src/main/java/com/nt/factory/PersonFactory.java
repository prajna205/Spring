package com.nt.factory;

import com.nt.comp.Aadhardetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

//Factory Pattern
public class PersonFactory {
//static factory method having generic/common return type
	public static Person getPerson(String type) {
		Person per = null;
		Aadhardetails details = null;
		if (type.equalsIgnoreCase("emp")) {
			details = new Aadhardetails(123567L, 20, 369247L);
			per = new Employee("jobi", "ctc", details, "tcs", 75420.360);
		} else if (type.equalsIgnoreCase("cust")) {
			details = new Aadhardetails(128967L, 30, 123247L);
			per = new Customer("jani", "hyd", details, 123, 5243.00);
		} else if (type.equalsIgnoreCase("stud")) {
			details = new Aadhardetails(123741L, 35, 503247L);
			per = new Student("kitty", "nepal", details, 104, "java");
		} else {
			throw new IllegalArgumentException("invalid person type");
		}
		return per;
	}
}
