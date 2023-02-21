package com.ktg.oops;

import java.util.Date;//ctrl+shift+O 
class SuperParent {
	int x = 190;
	public void sumOfTwo() {
		int a = 111;
		int b = 222;
		System.out.println("sum of two numbers : " + (a + b));
	}
}
class Parent extends SuperParent {
	public void printTime() {
		Date date = new Date();
		System.out.println("Current Time :" + date.getHours() + " :" + date.getMinutes() + ":" + date.getSeconds());
	}
	public void printMessage() {
		System.out.println("Hello AM from Parent class....");
	}
}
public class OopsTest extends Parent {
	public void printDate() {
		Date date = new Date();
		System.out.println("today's date :" + date.getDate());
	}
	public static void main(String[] args) {
		OopsTest obj = new OopsTest();
		obj.printDate();
		obj.printMessage();
		obj.printTime();
		System.out.println(obj.x);
		obj.sumOfTwo();
		
	}

}
