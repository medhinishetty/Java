package inhertianceassig;
class Employee{  
	 static float salary=40000;

	public Employee() {
	
		System.out.println("Salary:"+salary);
	}
	 
	}  
	class Teamlead extends Employee{ 
		int bonus =10000; 
	
	public Teamlead() {
		System.out.println("Bonus:"+bonus);
		}
	}
	class TeamMember extends Teamlead{
            int overtimesalary=1000 ;

			public TeamMember(int overtimesalary) {
				super();
				this.overtimesalary = overtimesalary;
			}

						
		
			// TODO Auto-generated constructor stub
		}
		
	


public class Multilevel {

	public static void main(String[] args) {

		  TeamMember p1=new TeamMember(1000); 
			 System.out.println(" Salary:"+p1.salary);  
			   System.out.println("Bonus  is:"+p1.bonus);  
			   System.out.println("OvertimeSalary  is:"+p1.overtimesalary);  

		// TODO Auto-generated method stub

	}

}
