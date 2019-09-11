package inhertianceassig;
class Base{
	Base(int a)
	{System.out.println("Base1");}
	
}
class Sub extends Base
{
 Sub()
 {
	 super(20);
	 System.out.println("no argument");
 }

Sub(int b)
{
	super(20);
	System.out.println("one parameter");
	}

Sub(int c, int d)
{
  super(20);
  System.out.println("two parameter"); }}
public class Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sub s1 = new Sub();

	}

}
