/*above program  using "implements Runnable" method.
*/package multithreadingassigment;


public class Sample2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		Sample2 ob=new Sample2();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for(char ch ='A';ch<='J';ch++) {
			
			System.out.println(ch);

	}

}
	}
