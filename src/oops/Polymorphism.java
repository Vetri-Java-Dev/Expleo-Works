package oops;

//Method overloading
//Method overriding

class Animal{
	
	public void sleep() {
		System.out.println("Sleeping....");
	}
	
	public void sound() {
		System.out.println("sounding.....");
	}
	
}

// Animal -> Cat
// Animal -> Dog

class Cat extends Animal{
	
	public void meowing() {
		System.out.println("Meowing.....");
	}
	
}

class Dog extends Animal{
	
	public void bark() {
		System.out.println("Barking....");
	}
}


public class Polymorphism {
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		
		dog.bark();
		dog.sleep();
		dog.sound();
	}
}
