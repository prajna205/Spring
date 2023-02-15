package com.nt.comp;

public class Student extends Person {
private int rollNo;
private String course;


public Student(String name, String addrs, Aadhardetails aadhar, int rollNo, String course) {
	super(name, addrs, aadhar);
	System.out.println("Student::5-param constructor");
	this.rollNo = rollNo;
	this.course = course;
}


@Override
public String toString() {
	return super.toString() +"Student [rollNo=" + rollNo + ", course=" + course +  "]";
}


}
