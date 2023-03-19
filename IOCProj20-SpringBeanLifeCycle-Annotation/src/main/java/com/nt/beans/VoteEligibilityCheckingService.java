package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voting")
@PropertySource(value="com/nt/commons/info.properties")
public class VoteEligibilityCheckingService {
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
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

	// instantiation life cycle method
	@PostConstruct
	public void myInit() {
		System.out.println("VoteEligibilityCheckingService.myInit()");
		verifirdOn = new Date();
		if (name == null || age < 0)
			throw new IllegalArgumentException("invalid name or age");
	}

	// destroy life cycle method
	@PreDestroy
	public void myDestroy() {
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
