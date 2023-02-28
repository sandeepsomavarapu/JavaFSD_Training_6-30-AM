package com.ktg.oops;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEid(123);
		emp.setEname("abhishek");
		emp.setEsal(40000.0f);
		emp.setEdesg("developer");
		emp.setEadd("hyderabad");
		System.out.println(emp.getEid()+" "+emp.getEdesg()+" "+emp.getEname()+" "+emp.getEsal()+" "+emp.getEadd());

	}

}
