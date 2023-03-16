package com.nt.sbeans;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("fflight")
//@Primary
public final class FirstFlight implements Courier {

	public  FirstFlight() {
	System.out.println("FirstFlight.0-param constructor");
}
@Override
	public String deliver(int oid) {
		return oid+ " order id is assigned to FirstFlight for delivery.";
	}
}
