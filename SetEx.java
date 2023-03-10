package com.ktg.collections;

import java.util.TreeSet;

//1)Collections are not fixed in size   AL-->10  11th value   16   (cc*3/2)+1
//2)Collections can hold/store both homogeneous and  haterogeneous data
//3)lots utility methods
//Set 
//1)duplicates are not allowed
//2)insertion order is not followed
public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> al1 = new TreeSet<String>();
		al1.add("suresh");
		al1.add("naresh");
		al1.add("ramesh");
		al1.add("rajesh");
		al1.add("suresh");
		al1.add("somesh");
		System.out.println(al1);
	}

}
