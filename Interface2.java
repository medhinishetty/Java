package inhertianceassig;
class Parent1{

	public String disp2()
	{
		return "in disp2 of parent1";
	}

}
interface Parent2 {
	String disp1();
	default String disp2()
	{
		return "in disp2 of parent2";
	}
}
class child extends Parent1 implements Parent2{

	@Override
	public String disp1() {
		// TODO Auto-generated method stub
		return "in disp1";
	}
	
}
public class Interface2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child m=new child();
		System.out.println(m.disp1());
		System.out.println(m.disp2());
	}

}
