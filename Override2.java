package inhertianceassig;
class vehicles{
	public void start() {
		System.out.println("Start the vehicle");
	}
	
}
class Fourwheels extends vehicles{
	public void start() {
		System.out.println("starting");
	}
}

public class Override2 {
    public static void main(String[] args) {
		
    	Fourwheels w = new Fourwheels();
    	   w.start();
	}
}
