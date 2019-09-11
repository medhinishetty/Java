package inhertianceassig;
interface Game{
	abstract void play();
}
class Cricket implements Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("playing Cricket");
	}
	
}
class Football implements Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Footaball");
	}
	
}
public class Demo {
 
	static void perform(Game g) {
		g.play();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
perform(new Cricket());
perform(new Football());
	}

}
