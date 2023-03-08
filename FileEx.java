package com.ktg.io;

import java.io.File;
import java.io.IOException;

class FileEx {
	public static void main(String[] args) throws IOException {
		File f = new File("ktg");
		System.out.println(f.exists());// false
		//System.out.println(f.createNewFile());// true
		System.out.println(f.mkdir());//true
	//	System.out.println(f.setReadOnly());// true
		System.out.println(f.exists());// true
		System.out.println(f.isDirectory());// false
		System.out.println(f.isFile());// true
	}
}
