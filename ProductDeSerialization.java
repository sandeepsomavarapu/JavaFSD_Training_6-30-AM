package com.ktg.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProductDeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream outs = new FileInputStream("products.txt");
		ObjectInputStream oos = new ObjectInputStream(outs);

		Product product = (Product) oos.readObject();
		System.out.println(product);
		System.out.println("DeSerialization is completed");
	}

}
