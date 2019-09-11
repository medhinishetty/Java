package inhertianceassig;
abstract class Shape{
	abstract void draw();
}
class Triangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
     System.out.println("Draw Triangle");		
	}

}
class Polygon extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Polygon");
	}
	
}
class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Circle");
	}
	
}
public class Array {
public static void main(String[] args) {
 int i;
	Shape arr[] = new Shape[3];
arr[0] = new Triangle();
arr[1] = new Polygon();
arr[2] = new Circle();

for (i=0;i<arr.length;i++) {

	arr[i].draw();
}
}
}
