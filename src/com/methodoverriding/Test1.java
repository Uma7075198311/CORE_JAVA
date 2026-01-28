package com.methodoverriding;
class Animal{
	public void makeSound() {
		System.out.println("Animal sound");
	}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Bark");
	}	
}
public class Test1 {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.makeSound();
		
	 Dog a1=new Dog();
	 a1.makeSound();
		

	}

}
