package com.ktg.collections;

import java.util.ArrayList;
import java.util.LinkedList;

//1)Collections are not fixed in size   AL-->10  11th value   16   (cc*3/2)+1
//2)Collections can hold/store both homogeneous and  heterogeneous data
//3)lots utility methods
//List 
//1)duplicates are allowed
//2)insertion order is preserved
public class ListEx {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();// 10 16

		al.add("suresh");
		al.add(true);
		al.add(123);
		al.add("suresh");
		al.add('q');
		al.add(78.5);

		System.out.println(al);
		LinkedList<String> al1 = new LinkedList<String>();// 10 16

		al1.add("suresh");
		al1.add("naresh");
		al1.add("ramesh");
		al1.add("rajesh");
		al1.add("suresh");
		al1.add("somesh");
		

		System.out.println(al1);
	}

}
