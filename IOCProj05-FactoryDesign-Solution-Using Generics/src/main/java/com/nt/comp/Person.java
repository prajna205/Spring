package com.nt.comp;

public class Person { 
	private String name;
	private String addrs;
	private Aadhardetails aadhar;
	
	
	
	public Person(String name, String addrs, Aadhardetails aadhar) {
		System.out.println("Person::3-param constructor");
		this.name = name;
		this.addrs = addrs;
		this.aadhar = aadhar;
	}



	@Override
	public String toString() {
		return super.toString() +"Person [name=" + name + ", addrs=" + addrs + "]";
	}
	
	
	
	
}
