package com.ktg.core;

public class CommandLineArgsEx2 {

	public static void main(String[] args) { // arguments -->123 mahesh 92345.67 hyderabad mahesh@gmail 29
		int eid = Integer.parseInt(args[0]);
		String ename = args[1];
		float salary = Float.parseFloat(args[2]);
		String address = args[3];
		String email = args[4];
		byte age = Byte.parseByte(args[5]);

		System.out.println("Employee Info:");
		System.out.println(eid + " " + ename + "  " + salary + " " + address + " " + email + " " + age);
	}

}
