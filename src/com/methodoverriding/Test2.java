package com.methodoverriding;
class Vehicle{
	public void start() {
		System.out.println("Vehicle started" );
	}
}
class Car extends Vehicle{
	public void start() {
		System.out.println("car started" );
	}
}
public class Test2 {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.start();
		Car c=new Car();
		c.start();

	}

}
