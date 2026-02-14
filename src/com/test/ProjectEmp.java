package com.test;

import java.util.Scanner;

public class ProjectEmp extends Employee {
String ProjectName;
String Role;
int[] score;

public ProjectEmp(String empname, Integer empId, String dept, String projectName, String role, int[] score) {
	super(empname, empId, dept);
	this.ProjectName = projectName;
	this.Role  = role;
	this.score = score;
}

public void projectRole(String NewRole) {
	if(NewRole==null) {
		System.out.println("invalid");
	}else {
		Role=NewRole;
		System.out.println(" Role Updated"+Role);
	}
}
public void projectName(String NewName) {
	if(ProjectName==null) {
		System.out.println("invalid");
	}else {
		ProjectName=NewName;
		System.out.println(" Updated Project Name"+ProjectName);
	}
}

public void menu() {
	displayemployeeDetails();	
	System.out.println("project Name:"+ProjectName);
	System.out.println("Project role:"+Role);
	System.out.println("Performance score:");
	 for (int s : score) {
         System.out.print(s + " ");
     }
     System.out.println();
 }
public void viewAveragePerformance() {
    int sum = 0;
    for (int s : score) {
        sum += s;
    }
    double avg = sum / 3.0;
    System.out.println("Average Performance Score: " + avg);
}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Employee Name:");
		String empname=sc.nextLine();
		System.out.println("Employee ID:");
		Integer empId=sc.nextInt();
		System.out.println("Department :");
		String dept=sc.nextLine();
		System.out.println("enter Project Name:");
		String projectName=sc.nextLine();
		System.out.println("Project Role:");
		String role=sc.nextLine();
		System.out.println("\nEnter 3 Monthly Performance Scores:");
		int[] score=new int[3];
		 for (int i = 0; i < 3; i++) {
	         System.out.print("Month " + (i + 1) + ": ");
	         score[i] = sc.nextInt();
	     }
	     sc.nextLine();
		ProjectEmp p=new ProjectEmp(empname,empId,dept,projectName,role,score);
		  System.out.println("\n Employee Profile Created Successfully!");
		  while (true) {
	          System.out.println("\n--- Menu ---");
	          System.out.println("1. Update Project Role");
	          System.out.println("2. Update Project Name");
	          System.out.println("3. View Employee Profile");
	          System.out.println("4. View Average Performance Score");
	          System.out.println("5. Exit");
	          System.out.print("Enter choice: ");

	          int choice = sc.nextInt();
	          sc.nextLine();
	          switch (choice) {
	          case 1:
	              System.out.print("Enter new Project Role: ");
	              String newRole = sc.nextLine();
	              p.projectRole(newRole);
	              break;

	          case 2:
	              System.out.print("Enter new Project Name: ");
	              String newProject = sc.nextLine();
	              p.projectName(newProject);
	              break;

	          case 3:
	              p.menu();
	              break;

	          case 4:
	              p.viewAveragePerformance();
	              break;
	          case 5:
	              System.out.println(" Exit");
	              sc.close();
	              return;

	          default:
	              System.out.println(" Invalid choice. Please try again.");
	      }

	}

	}}
