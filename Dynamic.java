package inhertianceassig;
class Top1{
	public void disp1() 
	{
		System.out.println("display top");
	}
}
class Bottom1 extends Top1{
     public void disp1() {
    	 System.out.println("Display Bottom1");
     }
}
class Bottom2 extends Top1{
	public void disp1() {
		System.out.println("Display Bottom2");
	}
}
class Bottom3 extends Top1{
	public void disp1() {
		System.out.println("Display Bottom3");
	}
}
public class Dynamic {

	public static void main(String[] args) {
		Top1 b1 = new Bottom1();
		b1.disp1();
		Top1 b2 = new Bottom2();
		b2.disp1();
		Top1 b3 = new Bottom3();
         b3.disp1();
		// TODO Auto-generated method stub

	}

}
