package com.ktg.stringExamples;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("capgemini");//muttable
		StringBuilder sb1=new StringBuilder("capgemini");
	
		sb.append(" india");
		
		System.out.println(sb);
		
		
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
		
	}

}
