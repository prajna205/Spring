package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cktr")
@PropertySource(value = "com/nt/commons/info.properties")
public class Cricketer implements ApplicationContextAware {
	@Value("${cktr.name}")
	private String name;
	@Value("${cktr.jersyNo}")
	private int jersyNo;

	private ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()");
		this.ctx=ctx;
	}

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
		// perform dependency loop up to get bat obj(dependent class obj)
		// CricketBat bat = ctx.getBean("bat", CricketBat.class);
		CricketBat bat = ctx.getBean(CricketBat.class);
		int run = bat.Score();
		System.out.println(name + " with jersy no " + jersyNo + " has scored " + run);

	}
}
