package com.ktg.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductSerialization {

	public static void main(String[] args) throws IOException {
		Product product = new Product(123, "samsung", 90000, "electronics");

		FileOutputStream outs = new FileOutputStream("products.txt");
		ObjectOutputStream oos = new ObjectOutputStream(outs);

		oos.writeObject(product);
		System.out.println("Serialization is completed");
	}

}
