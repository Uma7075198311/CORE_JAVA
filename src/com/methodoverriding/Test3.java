package com.methodoverriding;
class Person{
	protected void display() {
		System.out.println("I am a person");
	}
}
class Student{
	public void display() {
		System.out.println("I am a student");	
	}
}
public class Test3 {

	public static void main(String[] args) {
		Student s=new Student();
         s.display();
	}

}
