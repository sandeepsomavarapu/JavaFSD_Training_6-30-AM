package com.ktg.exceptions;

import java.util.Scanner;

class InvalidCredentials extends RuntimeException {
	InvalidCredentials(String msg) {
		super(msg);
	}

}

public class Exception7 {

	public static void validate(String uname, String pass) {
		if (uname.equals("ktg") && pass.equals("ktg123")) {
			System.out.println("LOGIN SUCCESS");
		} else {
			throw new InvalidCredentials("Login Failure.....");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String username = scan.next();
		System.out.println("Enter password : ");
		String password = scan.next();

		Exception7.validate(username, password);
	}

}
