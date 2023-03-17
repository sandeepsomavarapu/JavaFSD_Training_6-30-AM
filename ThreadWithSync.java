package com.ktg.threads;
class First {
	public synchronized void display(String msg) {
		System.out.print("[" + msg);// [welcome][new][ja ]
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Second extends Thread// is-a
{
	String msg;
	First fobj;// has-a

	Second(First fp, String str) {
		this.fobj = fp;
		this.msg = str;
		this.start();
	}

	public void run() {
		fobj.display(msg);// welcome
	}
}

public class ThreadWithSync {
	public static void main(String[] args) {
		First fnew = new First();

		Second ss = new Second(fnew, "welcome");

		ss = new Second(fnew, "new");

		ss = new Second(fnew, "java programmer");

	}
}