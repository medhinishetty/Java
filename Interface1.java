package inhertianceassig;
interface A{
	void disp1();
}
interface B extends A{
	 void disp2();
}
public class Interface1 implements B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Interface1 m = new Interface1();
 m.disp1();
 m.disp2();
 
	}

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}

}
