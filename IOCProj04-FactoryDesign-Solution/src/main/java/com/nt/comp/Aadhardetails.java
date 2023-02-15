package com.nt.comp;

public class Aadhardetails {
private long aadharNo;
private int age;
private long mobNo;
@Override
public String toString() {
	return "Aadhardetails [aadharNo=" + aadharNo + ", age=" + age + ", mobNo=" + mobNo + "]";
}
public Aadhardetails(long aadharNo, int age, long mobNo) {
	System.out.println("Aadhardetails.Aadhardetails()");
	this.aadharNo = aadharNo;
	this.age = age;
	this.mobNo = mobNo;
}


}
