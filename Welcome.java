package pack1;

public class Welcome {

public void m1() {//protected,default,private 
		System.out.println("am from welcome class m1 method");
	}

	public static void main(String[] args) {
		Welcome wel = new Welcome();
		wel.m1();//public :inside the class
	}

}

class Hello extends Welcome {

	public void myMethod() {
		Hello wel = new Hello();
		wel.m1();//inside the package child class
	}
}

class Dell {

	public void myMethod() {
		Welcome wel = new Welcome();
		wel.m1();//inside the package non sub class
	}
}