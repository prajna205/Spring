package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class LookupMethodInjectionTest 
{
    public static void main( String[] args )
    {
        //create IOC container
    	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	//get target class obj
    	Cricketer crickter=ctx.getBean("cktr",Cricketer.class);
    	//invoke b.method
    	crickter.batting();
    	crickter.bowling();
    	crickter.fielding();
    	//close the container
    	ctx.close();
    }
}
