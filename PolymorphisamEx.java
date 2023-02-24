package com.ericcson.oops;

import java.util.ArrayList;

public class PolymorphisamEx {
	public void add(int a, int b) {
		System.out.println("addition of two int's : " + (a + b));
	}
	public void add(int a, int b, int c) {
		System.out.println("addition of three int's : " + (a + b + c));
	}
	public void add(float a, float b) {
		System.out.println("addition of two float's : " + (a + b));
	}
	public void add(int a, float b) {
		System.out.println("addition of int , float : " + (a + b));
	}
	public void add(float a, int b) {
		System.out.println("addition of float, int : " + (a + b));
	}
	public static void main(String[] args) {
		PolymorphisamEx obj = new PolymorphisamEx();
		
	
		obj.add(12, 23);
		obj.add(23.4f, 43.5f);
		obj.add(1, 2, 3);
		obj.add(12, 89.4f);
		obj.add('a', 'b');//type promotion
		
	}

}
