package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource("classpath:com/nt/commons/info.properties")
public class Employee {
	@Value("${emp.id}")
	private int empno;
	@Value("${emp.name}")
	private String empName;
	@Value("${emp.addrs}")
	private String empAddrs;

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + ", empAddrs=" + empAddrs + "]";
	}

}
