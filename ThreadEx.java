package com.ktg.threads;

public class ThreadEx implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName("ktgroup");
		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getPriority());// 10
		System.out.println(Thread.currentThread().getName());// thread-0
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");// 5
		}
	}

	public static void main(String[] args) {

		Thread.currentThread().setName("KTG");
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		ThreadEx obj = new ThreadEx();
		Thread th = new Thread(obj);
		th.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");// 5 //1-10
		}
	}

}
