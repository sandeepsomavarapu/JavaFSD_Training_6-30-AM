package com.ktg.threads;

class Number {
	public int n;
	boolean value = false;
	synchronized void even(int n)// waiting
	{
		if (!value)// true
		{
			try {
				//Thread.sleep(1000);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println(n);// 1,2,
		value = false;
		//notify();
	}// 1--100 even odd wait,notify,notifyAll

	synchronized void odd(int n)// 1
	{
		if (value)// false
		{
			try {
			//Thread.sleep(1000);
				wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println(n);// 1,3,5,
		value = true;
		notify();
	}
}

class Odd implements Runnable {
	Number num;

	Odd(Number num) {
		this.num = num;
		new Thread(this, "odd").start();
	}

	public void run() {
		for (int i = 1; i <= 100; i = i + 2) {
			num.odd(i);// 1,3,5,....
		}
	}
}

class Even implements Runnable {
	Number num;// has-a

	Even(Number num) {
		this.num = num;
		new Thread(this, "even").start();
	}

	public void run() {
		for (int i = 2; i <= 100; i = i + 2) {
			num.even(i);// 2,4,6....
		}
	}
}

public class ThreadInter1 {
	public static void main(String[] args) {
		Number number = new Number();
		Even e = new Even(number);//2
		Odd d = new Odd(number);
	}
}