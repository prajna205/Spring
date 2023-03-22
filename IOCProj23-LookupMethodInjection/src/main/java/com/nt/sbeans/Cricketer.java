package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource(value = "com/nt/commons/info.properties")
public abstract class Cricketer {
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private int jersyNo;

	public Cricketer() {
		System.out.println("Cricketer::0-param constructor()");
	}

	public void fielding() {
		System.out.println(name + " with jersy no " + jersyNo + " id fielding.");
	}

	public void bowling() {
		System.out.println(name + " with jersy no " + jersyNo + " id bowling.");
	}

	public void batting() {
		//get dependant class obj
		CricketBat bat = getBat();
		int run = bat.Score();
		System.out.println(name + " with jersy no " + jersyNo + " has scored " + run);

	}
	@Lookup
	public abstract CricketBat getBat();
}
