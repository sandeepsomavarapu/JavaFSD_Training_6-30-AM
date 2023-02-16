package com.ktg.core;

public class CommandLineArgsEx1 {

	public static void main(String[] args) {// java CommandLineArgsEx  123 234 ktg 23.4
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		double c=Double.parseDouble(args[3]);
		System.out.println(a+b+c);
		
		System.out.println(args[2]);
		
		
	}

}
