package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DHL implements Courier {

	public  DHL() {
	System.out.println("DHL.0-param constructor");
}
@Override
	public String deliver(int oid) {
		return oid+ " order id is assigned to DHL for delivery.";
	}
}
