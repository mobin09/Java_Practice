package javaIo;
import java.io.*;

public class Demo2 {

	public static void main(String[] args) throws IOException{
		File f = new File("fileName.txt"); // this line check whether the file fileName.txt exist or not
		// if the file is available then it represent the that file otherwise it simply represent the java
		// File object.
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		File f2 = new File("IPLTeams");
		System.out.println(f2.exists());
		f2.mkdir();
		System.out.println(f2.exists());
		
		File f3 = new File(f2, "DelhiIndians.txt");
		f3.createNewFile();
		File f4 = new File(f2, "MumbaiIndians.txt");
		f4.createNewFile();
		
		System.out.println("File is created " + f3.exists() + " " + f4.exists());
		
		File f5 = new File("E:\\");
		String[] str = f5.list();
		
		for(int i=0; i<str.length; i++) {
			File f6 = new File(f5, str[i]);
		    
			if(f6.isFile()) {
				System.out.println("This is the File: " + str[i]);
			}
			
			if(f6.isDirectory()) {
				System.out.println("This is the Directory: " + str[i]);
			}
			
			
		}
		
		System.out.println("THIS IS THE END IF THE DIKENBD");
		
		
	}

}
