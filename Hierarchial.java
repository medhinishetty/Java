package inhertianceassig;
class Employees1{  
	 float salary=50000;

	public Employees1() {
	
		System.out.println("Salary:"+salary);
	}
	 
	} 

	class Programmer extends Employees1{ 
		int bonus =1000; 

	public Programmer() {
			
			
			System.out.println("Bonus:"+bonus);
		}

	}
	class Manger extends Employees1{
           int  bonus =2000;

			public Manger() {
				System.out.println("Bonus:"+bonus);
				
			}
			
	}
		

public class Hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p3=new Programmer(); 
		 System.out.println("Programmer salary is:"+p3.salary);  
		   System.out.println("Bonus of Programmer is:"+p3.bonus);  
			Manger p2=new Manger(); 
			 System.out.println("Manger salary is:"+p2.salary);  
			   System.out.println("Manger  bonus is:"+p2.bonus);

	}

}
