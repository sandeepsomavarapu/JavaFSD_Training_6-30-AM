package com.ericcson.oops;

class SuperClass

{
	int age = 29;
	int weight = 56;

	public void printAge() {
		age = ++age;
		System.out.println("Your Age is : " + age);
	}

	public void printWeight() {
		weight = ++weight;
		System.out.println("Your Weight is : " + weight);
	}
}

public class OverridingEx extends SuperClass {
	@Override
	public void printWeight() {
		weight = --weight;
		System.out.println("Your Weight is : " + weight);
	}

	public static void main(String[] args) {
		OverridingEx obj = new OverridingEx();
		obj.printAge();
		obj.printWeight();
	}

}
