package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;
@Component("bankServiceReplacer")
public class calculateInterstAmountMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("calculateInterstAmountMethodReplacer.reimplement()(simple intrest)");
		double pamt = (double) args[0];
		double rate = (double) args[1];
		double time = (double) args[2];
		//calculate simple intrest amount
		double intAmount=  (pamt*rate*time)/100.0f;
		return intAmount;
	}
}
