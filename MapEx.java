package com.ktg.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> emps = new TreeMap<Integer, String>();

		emps.put(111, "mahesh");// entry->key,value
		emps.put(987, "suresh");
		emps.put(765, "naresh");
		emps.put(908, "ramesh");
		emps.put(987, "punith");
		emps.put(21, "rajesh");
		emps.put(67, "suresh");
		emps.put(1234, "somesh");

		Set<Integer> keys = emps.keySet();
		Iterator<Integer> itr = keys.iterator();

		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + "  " + emps.get(key));

		}

		Set<Entry<Integer, String>> entries = emps.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entries.iterator();

		while (itr1.hasNext()) {
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());

		}
		// emps.remove(21);
//		System.out.println(emps);
//
//		System.out.println(emps.containsValue("sandeep"));
//		
//		System.out.println(emps.get(765));

	}

}
