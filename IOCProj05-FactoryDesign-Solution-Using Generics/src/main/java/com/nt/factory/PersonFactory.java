package com.nt.factory;

import java.lang.reflect.Constructor;

import com.nt.comp.Aadhardetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

//Factory Pattern
public class PersonFactory {
//static factory method having generic/common return type
	public static <T extends Person> T  getPerson(Class<T> clazz) throws Exception {
	 Constructor cons[]= clazz.getDeclaredConstructors();
	 Object obj=null;
	 if (clazz==Employee.class) {
		Aadhardetails details= new Aadhardetails(123547L, 25, 963258L);
		obj=cons[0].newInstance("raja","hyd",details,"Hcl",2574.0);
	}
	 else if (clazz==Customer.class) {
			Aadhardetails details= new Aadhardetails(873547L, 29, 96235458L);
			obj=cons[0].newInstance("rani","vizag",details,8754,9687.0);
		}
	 else if (clazz==Student.class) {
			Aadhardetails details= new Aadhardetails(1235999L, 22, 9147258L);
			obj=cons[0].newInstance("jimi","mumbai",details,"java",110);
		}
	 else {
		throw new IllegalArgumentException("Invalid person type");
	}
	 return (T)obj;
	}
}
