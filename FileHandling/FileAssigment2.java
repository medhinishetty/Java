package fileassigment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileAssigment2 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int custid ;
	String custname;
	 String address;
	 int age;
	 
	 
	public FileAssigment2(int custid, String custname, String address, int age) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.address = address;
		this.age = age;
	}


	public static void main(String[] args) {
		
     FileAssigment2 fa1 = new FileAssigment2(1, "Ravi", "Mumbai", 24);
    try( FileOutputStream fos = new FileOutputStream("D:\\Practise\\abc5.txt")){
    	
    try(ObjectOutputStream oos =new ObjectOutputStream(fos)){
     oos.writeObject(fa1);	
    	
    	}	
    }catch(Exception ee) {
    	System.out.println(ee);
    }
    System.out.println(fa1.custid+"\t"+fa1.age+"\t"+fa1.custname+"\t"+fa1.address);
    try(FileInputStream fis = new FileInputStream("D:\\Practise\\abc5.txt")){
   
    	try(ObjectInputStream ois = new ObjectInputStream(fis)){
    		ois.readObject();
    	}
    }catch(Exception ee) {
    	System.out.println(ee);
    }
}
	}