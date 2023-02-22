package com.ktg.oops;

import java.util.Date;

interface Calculator {
	// by default interface methods are public abstract

	public abstract void addOfTwo();

	void subOfTwo();// public abstract void subOfTwo();
}

abstract class AbstractEx implements Calculator {

	public void printTime() {
		Date date = new Date();
		System.out.println("current time: " + date.getHours());
	}

	public abstract void printMessage();
}

public class AbstractConcreteMethods extends AbstractEx {
	public void printDate() {
		Date date = new Date();
		System.out.println("Today's Date : " + date);
	}

	public static void main(String[] args) {
		AbstractConcreteMethods obj = new AbstractConcreteMethods();
		obj.printDate();
		obj.printTime();
	}

	public void addOfTwo() {
		int a = 789;
		int b = 456;
		System.out.println("add of two numbers " + (a + b));
	}

	public void subOfTwo() {
		int a = 789;
		int b = 456;
		System.out.println("add of two numbers " + (a + b));
	}

	public void printMessage() {
		System.out.println("hello ... am from child class...");
	}

}
