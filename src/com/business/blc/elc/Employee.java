package com.business.blc.elc;

public class Employee {
	int employeeId;
	String employeeName;
    double salary;
	 
	 public int getemployeeId() {
		 return employeeId;
	 }
	 public String getemployeeName() {
		 return employeeName;
	 }
	 public double getsalary() {
		 return salary;
	 }
	 public void setemployeeId(int i) {
		 employeeId=i;
	 }
	 public void setemployeeName(String name) {
		 employeeName=name;
	 }
	 public void setsalary(double d) {
		 salary=d;
	 }
	 public String getPayrollSystem() {
		 return "EmployeeId:"+employeeId+"\nEmployeeName:"+employeeName+"\nSalary:"+salary;
	 }
}
