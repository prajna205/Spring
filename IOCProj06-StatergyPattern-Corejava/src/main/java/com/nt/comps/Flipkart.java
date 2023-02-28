package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public  class Flipkart {
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart::0-param constructor");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
	public String shopping(String items[], double price[]) {
		System.out.println("Flipkart.shopping()");
		double billAmt=0;
		//calculate bill amount
		for(double p:price) {
			billAmt+=p;
		}
		//generate order id
		int old=new Random().nextInt(10000);
		//use courier
		String msg= courier.deliver(old);
		return Arrays.toString(items)+" are purchased having bill amount "+ billAmt+"-->"+msg;
	}	
}
