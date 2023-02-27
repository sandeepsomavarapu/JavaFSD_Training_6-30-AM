package com.ktg.oops;

class Calculator1 {
	int a = 11;
	int b = 21;

	public Calculator1() {
		this("suresh");
		System.out.println("am from pareny class default constructor");
	}
	public Calculator1(String name ) {
		System.out.println("am from parent class param constructor :"+name);
	}
	public void m1() {
		System.out.println("am from parent class m1 method");
	}
}

public class ThisSuper extends Calculator1 {
	int a = 12;
	int b = 22;

	public ThisSuper(String name) {
		this();// current class default constructor calling
		System.out.println("am from current class param constructor : " + name);
	}

	public ThisSuper() {
		super();
		System.out.println("am from default constructor of current class");
		int a = 10;
		int b = 20;
		System.out.println("add of two int's :" + (a + b));// 30
		System.out.println("add of two int's :" + (this.a + this.b));// 34
		System.out.println("add of two int's :" + (super.a + super.b));// 32
		this.m1();
		super.m1();
	}

	@Override
	public void m1() {
		System.out.println("am from current class m1 method");
	}

	public static void main(String[] args) {
		ThisSuper obj = new ThisSuper();

	}
}
