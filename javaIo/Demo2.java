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
		
		

	}

}
