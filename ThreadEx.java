package com.ktg.threads;

public class ThreadEx implements Runnable {

	@Override
	public void run() {// running
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);// waiting
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Child Thread");// dead state
		}
	}

	public static void main(String[] args) throws InterruptedException { // t1,t2
		ThreadEx obj = new ThreadEx();
		Thread th = new Thread(obj);// new state
		th.start(); // runnable state
		th.join();
		for (int i = 0; i < 10; i++) {

			System.out.println("Main Thread");// 5 //1-10
		}
	}

}
