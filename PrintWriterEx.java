package com.ktg.io;

import java.io.*;

class PrintWriterEx {
	public static void main(String args[]) throws IOException {

		FileWriter fw = new FileWriter("ktg1.txt");
		PrintWriter out = new PrintWriter(fw);// sop

		out.println(1000);
		out.println(false);
		out.println('s');
		out.println("ibm");
		out.flush();
		out.close();
		fw.close();
	}
}