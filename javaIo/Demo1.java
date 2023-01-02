package javaIo;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	
	
	
	public static void main(String[] args) throws IOException {
		String abc = "abc.txt";
		File file = new File(abc);

		System.out.println(file.exists());
		file.createNewFile(); // file created, if exist not created

		System.out.println(file.exists());
		

	}

}
