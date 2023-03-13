package com.ktg.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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
		al.add(1, 123);
		al.add("suresh");
		al.add('q');
		al.add(78.5);
		al.remove("suresh");
		System.out.println(al);
		ArrayList<String> al1 = new ArrayList<String>();// 10 16

		al1.add("suresh");
		al1.add("naresh");
		al1.add("ramesh");
		al1.add("rajesh");
		al1.add("suresh");
		al1.add("somesh");

		System.out.println(al1);

//		Iterator<String> itr = al1.iterator();
//
//		while (itr.hasNext()) {
//
//			System.out.println(itr.next());
//
//		}

		ListIterator<String> itr1 = al1.listIterator();

		while (itr1.hasNext()) {

			System.out.println(itr1.next());

		}
		System.out.println("In Reverse...");
		while (itr1.hasPrevious()) {

			System.out.println(itr1.previous());

		}
		// al1.remove(2);
//		System.out.println(al1);
//		System.out.println(al1.size());
//
//		ArrayList<String> al2 = new ArrayList<String>();
//		al2.add("sandeep");
//		al2.add("atiba");
//		System.out.println(al2);
//		al2.addAll(al1);
//		System.out.println(al2);
//		// al2.removeAll(al1);remove al1 values
//		// al2.retainAll(al1);// keep al1 values remove others
//		System.out.println(al2);
//		System.out.println(al2.contains("sandeep1"));
//		// al1.clear();
//		System.out.println(al2.get(1));
	}

}
