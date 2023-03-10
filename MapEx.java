package com.ktg.collections;

import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> emps = new TreeMap<Integer, String>();

		emps.put(111, "mahesh");
		emps.put(987, "suresh");
		emps.put(765, "naresh");
		emps.put(908, "ramesh");
		emps.put(987, "punith");
		emps.put(21, "rajesh");
		emps.put(67, "suresh");
		emps.put(1234, "somesh");
		System.out.println(emps);

	}

}
