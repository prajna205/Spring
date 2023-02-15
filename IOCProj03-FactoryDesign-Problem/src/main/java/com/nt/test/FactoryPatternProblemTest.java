package com.nt.test;

import com.nt.comp.Aadhardetails;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class FactoryPatternProblemTest {
	public static void main(String[] args) {
//create AadharDetails class obj
		Aadhardetails details = new Aadhardetails(123456L, 30, 8569411);//dependent obj
		Person emp = new Employee("raja", "hyd", details, "HCL", 7542.0);
		System.out.println(emp);
		System.out.println("------------------------------------------");
		Aadhardetails details1= new Aadhardetails(6789421L, 30, 1478521);//dependent obj
		Person student =new Student("praj", "bdk", details, 111, "mca");
		System.out.println(student);
		System.out.println("------------------------------------------");
	}
}
