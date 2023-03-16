package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class Dtdc implements Courier {

	public  Dtdc() {
	System.out.println("Dtdc.0-param constructor");
}
@Override
	public String deliver(int oid) {
		return oid+ " order id is assigned to DTDC for delivery.";
	}
}
