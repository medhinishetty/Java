package fileassigment;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileAssigment3 {

	public static void main(String[] args) {
		
		 byte b[]= new byte[1000];	// TODO Auto-generated method stub
try(FileInputStream fis = new FileInputStream("D:\\Practise\\abc5.txt"))
{
	fis.read(b);
}
catch(Exception ee) {
	System.out.println(ee);

}
try(FileOutputStream fos = new FileOutputStream("D:\\Practise\\abc9.txt")){
	fos.write(b);
}
    
catch(Exception e) {
	System.out.println(e);

}
}
	
}


