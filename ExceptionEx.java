package com.ktg.exceptions;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number for division ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number for division ");
		int num2 = scan.nextInt();
		try {
		int result = num1 / num2;
		System.out.println("division two numbers : " + result);
		}catch (ArithmeticException e) {
			System.out.println("Dont enter zero as denominator");
		}
		System.out.println("remaining 1000 lines .....");
		scan.close();
	}

}
