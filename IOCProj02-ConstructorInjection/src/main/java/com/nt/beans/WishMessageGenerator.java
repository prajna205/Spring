package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//Has-A property supporting composition or injection
	private Date date;
	
	//for constructor injection
	public WishMessageGenerator(Date date) {
		this.date=date;
		System.out.println("WishMessageGenerator:1-param constructor");
	}
	
	/*//setter method for setter injection
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate(-)");
		this.date = date;
	}*/
	//b.logic
	public String generateWishMessage(String user) {
		//get current hour of the day
		int hour = date.getHours();
		//generate wish message
		if(hour<12)
			return "Good Morning" + user;
		else if(hour<16)
			return "Good Afternoon" + user;
		else if(hour<20)
			return "Good Evening" + user;
		else
			return "Good Nigh" + user;
	}
}
