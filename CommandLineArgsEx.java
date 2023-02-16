package com.ktg.core;

public class CommandLineArgsEx {

	public static void main(String[] args) {// dynamic java Welcome "12" "13" sandeep
		int a = 12;// static data

		int b = 23;
		int result = a + b;

		int a1[] = { 23, 24, 2, 5, 6, 6, 7 };
		String name = "KTG";
		System.out.println(name);
		String names[] = { "sandeep", "atiba", "333", "444", "true", "234.56" };// index 0,1,2,3,4,5
			names[1]="saminz";
		System.out.println(names[1]);
		int num1=Integer.parseInt(names[2]);//parseInt-->Integer
		int num2=Integer.parseInt(names[3]);
		float fvalue=Float.parseFloat(names[5]);
		boolean result1=Boolean.parseBoolean(names[4]);

		System.out.println(num1+num2+fvalue);//777
		
		
		
		System.out.println("add of two numbers is : " + result);
	}

}
