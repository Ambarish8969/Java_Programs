package com.saturday.test2;

class Animal{
	String name;
	public void eat() {
		System.out.println("Meat");
	}
}
class Dog extends Animal{
	public Dog(String name) {
		this.name=name;
	}
}
public class Main1 {
	public static void main(String[] args) {
		Dog obj=new Dog("Rocky");
		System.out.println(obj.name);
		obj.eat();
	}

}
