package com.methodoverriding;
class Parent{
	public static void print() {
		System.out.println("Parent");
	}
}
class Child{
	public static void print() {
		System.out.println("Child");
	}
}
public class Test4 {

	public static void main(String[] args) {
		Parent.print();
		Child.print();

	}

}
