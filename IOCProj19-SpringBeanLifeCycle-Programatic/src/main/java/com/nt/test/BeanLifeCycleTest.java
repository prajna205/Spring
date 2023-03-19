package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteEligibilityCheckingService;

public class BeanLifeCycleTest 
{
    public static void main( String[] args )
    {
        //create AC container
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	//get spring bean class obj ref
    	VoteEligibilityCheckingService service= ctx.getBean("voting",VoteEligibilityCheckingService.class);
    	//invoke b.methood
    	String msg= service.checkVotingEligibity();
    	System.out.println(msg);
    	//close container
    	ctx.close();
    }
}
