package assigment2;
abstract class Game
{
  abstract void play();	
}
class Cricket extends Game
{

	@Override
	public void play() 
	{
		System.out.println("Playing Cricket ");
	}
}
class FootBall extends Game
{

	@Override
	public void play() 
	{
		System.out.println("Playing FootBall ");
	}
}
class Tennis extends  Game
{

	@Override
	public void play()
	{
		System.out.println("Playing Tennis ");
	}
}

public class AGame {
public static void main(String[] args) {
	int i;
	Game arr[]=new Game[4];
	
	arr[0] = new Cricket();
	arr[1]= new FootBall();
	arr[2]= new Tennis();
	
	for(i=0;i<arr.length;i++)
	{
		if(arr[i] instanceof Cricket)
		{
			arr[i].play();
		}  
	}	
}
}
