package com.ktg.core;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		//
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Product Id:");
		int productId = scan.nextInt();
		System.out.println("Enter Product Name:");
		String productName = scan.next();
		System.out.println("Enter Product Price:");
		float productPrice = scan.nextFloat();
		System.out.println("Enter Product Desc:");
		String productDesc = scan.next();
		System.out.println("Enter Product Availability:");
		boolean productAvailaibity = scan.nextBoolean();
		
		System.out.println("Product Info :");
		System.out.println(productId+" "+productName+" "+productPrice+" "+productDesc+" "+productAvailaibity );
		scan.close();

	}

}
