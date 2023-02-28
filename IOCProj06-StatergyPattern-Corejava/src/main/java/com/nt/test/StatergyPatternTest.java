package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StatergyPatternTest {
	public static void main(String[] args) throws Exception {
			//get target class obj from factory
		Flipkart fkt= FlipkartFactory.getInstance("dtdc");
		String resultMsg= fkt.shopping(new String[]{"candels","cake","wine"},
																		new double[] {500.0,1000.0,5000.0});
		System.out.println(resultMsg);
	}
}
