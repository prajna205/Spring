package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

//factory pattern
public class FlipkartFactory {
	public static Flipkart getInstance(String courierType) throws Exception {
		//create dependent class obj
		Courier courier=null;
		if(courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		}
		else if(courierType.equalsIgnoreCase("bluedart")) {
			courier = new BlueDart();
		}
		else {
			throw new IllegalAccessException("invalid courier type");
		}
		//create target class obj
		Flipkart fkt= new Flipkart();
		//assign dependant class obj to target class obj
		fkt.setCourier(courier);
		return fkt;
	}
}
