package com.ktg.threads;

public class ThreadEx1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread....");
	}

	public static void main(String[] args) {
		ThreadEx1 obj = new ThreadEx1();
		obj.start();
	}
}
