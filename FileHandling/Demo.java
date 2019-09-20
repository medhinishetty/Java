package fileassigments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private String Name;
	int age;
	public Person(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class Student extends Person{
private int rollno;
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, int rollno) {
		super(name, age);
		this.rollno = rollno;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
public class Demo {

	public static void main(String[] args) {
	Student s2 = new Student("Ram",23,12);
	s2.getAge();
	s2.getName();
	s2.getRollno();
	System.out.println();
	try(FileOutputStream fos = new FileOutputStream("D:\\Practise\\abc11.txt")){
	       try(ObjectOutputStream oos =new ObjectOutputStream(fos))	{
	    	   oos.writeObject(s2);
	    	   }	
		}catch(Exception ee) {
			ee.printStackTrace();
		}
	try(FileOutputStream fos = new FileOutputStream("D:\\Practise\\abc10.txt")){
	       try(ObjectOutputStream oos =new ObjectOutputStream(fos))	{
	    	   oos.writeObject(s2);
	    	   }	
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		System.out.println(s2.getName()+"\t"+s2.age+"\t"+s2.getRollno() );
		try(FileInputStream fis = new FileInputStream("D:\\Practise\\abc10.txt")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				ois.readObject();
			}
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("D:\\Practise\\abc11.txt")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				ois.readObject();
			}
		}catch(Exception ee) {
			ee.printStackTrace();
		}
	}

}
