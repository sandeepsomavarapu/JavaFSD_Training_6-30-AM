package com.ktg.stringExamples;

public class StringMethods {
	public static void main(String[] args) {

		String orgName = "ktg";// literal

		String orgName1 = "ktg";// literal

		System.out.println(orgName.equals(orgName1));// true

		System.out.println(orgName.compareTo(orgName1));//0

		System.out.println(orgName == orgName1);//true
		
		
		String name=new String("welcome");
		String name1=new String("welcome");
		
		
		System.out.println(name.equals(name1));// true

		System.out.println(name.compareTo(name1));//0

		System.out.println(name == name1);//false
		
		
		
		

		// returns -ve if obj1 has to come before obj2
		// returns +ve if obj1 has to come after obj2
		// returns 0 if both objects are same

		
	
		
		
		
		
		// orgName.concat(" india");//imuttable ktg india gc

		// String org=new String("capgemini");//new keyword

	}
}
