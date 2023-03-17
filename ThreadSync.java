package com.ktg.threads;
class Account {
	public int balance;
	public Account() 
	{
		balance = 5000;
	}
	public  synchronized void withdraw(int bal)
	{
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance = balance - bal;
		System.out.println("Amount withdrawn = " + bal);
		System.out.println("Remaining balance = " + balance);
	}
	public synchronized  void deposit(int bal)
	{
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		balance = balance + bal;
		System.out.println("Amount deposited = " + bal);
		System.out.println("New balance = " + balance);
	}
	public synchronized  void enquiry() {
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Available balance = " + balance);
	}
}
class Transaction implements Runnable 
{
	Account obj;//has-a

	Transaction(Account a) {
		obj = a;
	}
	public void run()
	{
		obj.withdraw(500);//4500
		obj.deposit(1000);//5500
		obj.enquiry();//5500
	}
}
public class ThreadSync {
	public static void main(String[] args)throws Exception
	{
		Account a = new Account();//balance=5000
		Transaction w1 = new Transaction(a);
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w1);
		t1.start();
		t2.start();
	}
}
