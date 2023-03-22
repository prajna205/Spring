package com.nt.service;

public class BankService {
	public double calculateInterstAmount(double pamt, double rate, double time) {
		System.out.println("BankService.calculateInterstAmount()(Compound intrest)");
		return (pamt * Math.pow((1 + rate / 100), time)) - pamt;
	}
}
