package com.ktg.oops;

interface Parent1 {
	void m1();
}

interface Parent2 {
	void m1();
}

public class MultipleInheritanceEx implements Parent1, Parent2 {

	public static void main(String[] args) {
		MultipleInheritanceEx obj = new MultipleInheritanceEx();
		obj.m1();
	}

	@Override
	public void m1() {
		System.out.println("MI is supported in java using interfaces");
	}

}
