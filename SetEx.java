package com.ktg.collections;

import java.util.Comparator;
import java.util.TreeSet;

//1)Collections are not fixed in size   AL-->10  11th value   16   (cc*3/2)+1
//2)Collections can hold/store both homogeneous and  heterogeneous data
//3)lots utility methods
//Set 
//1)duplicates are not allowed
//2)insertion order is not followed

//3)linked hashset will not allow duplicates but follows insertion order 
//4)treeset will store values  by following sorting order 

//Comparator  Comparable  interface,Functional Interface,marker interface 
public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> al1 = new TreeSet<String>(new MyOrder());
		al1.add("suresh");
		al1.add("naresh");
		al1.add("ramesh");
		al1.add("rajesh");
		al1.add("suresh");
		al1.add("somesh");
		System.out.println(al1);
		// Comparable-java.lang-->compareTo()  NSO
		// returns -ve if obj1 has to come before obj2
		// returns +ve if obj1 has to come after obj2
		// returns 0 if both objects are same
		
		//Comparator -->java.util -->compare()  CSO

	}

}
class MyOrder implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		
		//return -o1.compareTo(o2);
		return o2.compareTo(o1);
	}
	


}
