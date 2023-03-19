package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoteEligibilityCheckingService implements InitializingBean, DisposableBean{
	private String name;
	private int age;
	private Date verifirdOn;

//constructor
	public VoteEligibilityCheckingService() {
		System.out.println("VoteEligibilityCheckingService::0-param constructor");
	}

//setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// afterPropertiesSet() - init life cycle method
	@Override
	public void afterPropertiesSet() {
		System.out.println("VoteEligibilityCheckingService.myInit()");
		verifirdOn = new Date();
		if (name == null || age < 0)
			throw new IllegalArgumentException("invalid name or age");
	}

	// destroy()- destroy life cycle method
	@Override
	public void destroy() {
		System.out.println("VoteEligibilityCheckingService.myDestroy()");
		name = null;
		age = 0;
		verifirdOn = null;
	}

//b.method
	public String checkVotingEligibity() {
		System.out.println("VoteEligibilityCheckingService.checkVotingEligibity()");
		if (age >= 18)
			return "Mr./Mrs./Miss " + name + " ,you are eligible for voting.";
		else
			return "Master " + name + " ,you are not eligible for voting.";
	}

}
