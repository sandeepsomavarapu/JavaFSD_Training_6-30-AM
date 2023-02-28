package pack2;

import pack1.Welcome;

public class Test {

	public static void main(String[] args) {
		Welcome wel = new Welcome();
		wel.m1();// outside the package non sub class
	}

}

class Lenovo extends Welcome {
	public void testMethod() {
		Lenovo l = new Lenovo();
		l.m1();//outside the package sub class
	}
}
