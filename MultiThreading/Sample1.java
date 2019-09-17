/**create a multi-threaded application by using  "extends Thread " m
 * ethod.create 2 threads. they should display characters from A to J./
 */
package multithreadingassigment;

public class Sample1 extends Thread{

	public void run() {
		for(char ch ='A';ch<='J';ch++) {
		System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample1 Th1 = new Sample1();
		Sample1 Th2 =new Sample1();
		Th1.start();
		Th2.start();
	}

}
