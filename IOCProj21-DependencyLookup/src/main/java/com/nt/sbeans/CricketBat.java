package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class CricketBat {
	public CricketBat() {
		System.out.println("CricketBat::0-param constructor");
	}
	public int Score() {
		return new Random().nextInt(1000);
	}
}
