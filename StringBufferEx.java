package com.ktg.stringExamples;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("capgemini");//muttable
		StringBuffer sb1=new StringBuffer("capgemini");
	
	//	sb.append(" india");
		
		//System.out.println(sb);
		
		
		System.out.println(sb.equals(sb1));//==
		System.out.println(sb==sb1);
		
	
	}

}
