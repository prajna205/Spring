package com.nt.singleton;

public class Printer {
	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer::0-para constructor");
	}
	//static factory method
	public static Printer getInstance() {
		if (INSTANCE==null) 
			INSTANCE=new Printer();
		return INSTANCE;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
}
