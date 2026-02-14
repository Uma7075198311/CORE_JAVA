package com.test;

public class Employee {
String Empname;
Integer EmpId;
String Dept;
public Employee(String empname, Integer empId, String dept) {
	
	Empname = empname;
	EmpId = empId;
	Dept = dept;
}
public void displayemployeeDetails() {
	System.out.println("Employee Name:"+Empname);
	System.out.println("Employee Id:"+EmpId);
	System.out.println("Department:"+Dept);
}
public void projectRole() {
	System.out.println("");
}
}



	
