import java.util.Date;

public class Welcome {

	public void addition() {
		int a = 123;// local
		int b = 234;
		int result = a + b;
		System.out.println("add of a & b : " + result);
	}

	public void sub(int a, int b) {
		int result = a - b;
		System.out.println("sub of a & b : " + result);
	}

	public static void printDate() {
		System.out.println("Today's Date : " + new Date());
	}

	public String printMsg() {
		return "welcome methods in java";
	}

	public static void main(String[] args) {// JVM
		Welcome.printDate();
		System.out.println("welcome to java eclipse");// ctrl+space--for suggestions

		Welcome wel = new Welcome();
		wel.addition();

		wel.sub(200, 100);
		System.out.println(wel.printMsg());
	}
}
//ctrl+shift+f-->for formatting
