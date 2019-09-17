/*create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere. they should display output "Exec  0" to "Exec 5".
*/package multithreadingassigment;

public class Sample3 implements Runnable{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());

		// TODO Auto-generated method stub
      Sample3 o3 = new Sample3();
      Thread T1= new Thread(o3);
      Thread T2 = new Thread(o3);
      Thread T3 = new Thread(o3);
      T1.start();
      T2.start();
      T3.start();
      T1.setName("First");
      T2.setName("Second");
	}

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		for(int i=0; i<=5;i++) {
			System.out.println("Exce"+i);
		}
	}

}
