/*create 2 threads. Write a program which displays number 1 to 10 using class lock. 
[hint:- use "implements Runnable" and synchronized block]*/package multithreadingassigment;

import threads.ClassLock3;

public class Sample4 implements Runnable {
	static Class cs;
	 static void disp1()
	 {
	
				synchronized(cs)
				{
				for(int i=1;i<=10;i++)
				{
		System.out.println(i);
				try
				{
					Thread.sleep(200);
				}
				catch(InterruptedException ie)
				{
				}
				}
				}
			}
			public void run()
			{
				disp1();
				}
		public static void main(String[] args) throws Exception {
			cs=Class.forName("multithreadingassigment.Sample4");
			Sample4 c=new Sample4();
			Sample4 c1=new Sample4();
			Thread t1=new Thread(c);
			Thread t2=new Thread(c1);
			t1.start();
			t2.start();
		}
}
