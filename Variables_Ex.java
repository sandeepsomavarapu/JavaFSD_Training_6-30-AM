
public class Variables_Ex {

	long contact = 98989898899l;// global variable instance 8 bytes
	static String orgName = "KTG";// global variable static

	public static void main(String args[])// compiler-->compailation .java -->.class
	{ // local variables
		String name = "sandeep";
		int salary = 230000;
		float marks = 234.563453453453434f;
		double weight = 85.67234234234;
		char gender = 'M';
		boolean result = true;
		System.out.println(marks + "welcome to java" + weight);// jvm .class-->
		System.out.println("static can be accessed by using classname " + Variables_Ex.orgName);// jvm .class-->

		// classname objname=new classname();
		Variables_Ex obj = new Variables_Ex();// JVM-->heap
		System.out.println(obj.contact);

	}

}
//ctrl+space--for suggestions
//ctrl+shift+f-->formatting
//ctrl+shift+/-->for adding multiline comments 
//ctrl+shift+\-->for removing multiline comments 
//ctrl+/-->for adding and removing single line comments 

