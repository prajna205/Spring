package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource(value = "com/nt/commons/info.properties")
public class Cricketer {
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
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// perform dependency loop up to get bat obj(dependent class obj)
	//	CricketBat bat = ctx.getBean("bat", CricketBat.class);
		CricketBat bat = ctx.getBean(CricketBat.class);
		int run = bat.Score();
		System.out.println(name + " with jersy no " + jersyNo + " has scored " + run);

	}
}
