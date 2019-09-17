/*create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
both the threads should start simultaneously.
*/
package multithreadingassigment;

public class Sample5 implements Runnable {
	public static void main(String[] args) {
	
		Sample5 s1 = new Sample5();
		Thread th4 = new Thread(s1);
		
		Thread th3 = new Thread(s1);
		th4.start();
		th3.start();
		
	}
	
	public void disp() {
		try {
			if(Thread.currentThread() != null)
			{
		for(int i =1,j=50;i<=50;i++,j--) {
			System.out.println("T1"+""+i);
			if(j>0) {
			System.out.println("T2"+""+j);
			}
		}
		}
		
	}catch(Exception e){}
	
	}

	@Override
	synchronized public void run() {

		disp();
		
		}
		
		
	}


