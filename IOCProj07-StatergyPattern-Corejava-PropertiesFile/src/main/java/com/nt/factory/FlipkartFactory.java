package com.nt.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

//factory pattern
public class FlipkartFactory {
	
	private static Properties props;
	static {
		try {
			//locate peroperties file to string
			InputStream is = new FileInputStream("src/main/java/com/nt/commons/info.properties");
			//load properties file content to java.util.properties class obj
			props=new Properties();
			props.load(is);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}//static block
	//static factory method
	public static Flipkart getInstance() throws Exception {
		//get dependent class name
		String courierClassName= props.getProperty("courier.classname");
		//load the dependent class
		Class cls=Class.forName(courierClassName);
		//create the object for the loaded class
		Constructor<Courier> cons[]=cls.getDeclaredConstructors();
		Courier courier =cons[0].newInstance();
		//create target class obj
		Flipkart fkt= new Flipkart();
		//assign dependent class obj to target class obj
		fkt.setCourier(courier);
		return fkt;
	}
}
