package javaIo;

// CREATE THE FOLDER AND FIND OUT THE TOTAL NUMBERS OF .txt FILE AND .jpg FILE INSIDE that folder and 
// ALSO CALCULATE THE TOTAL NO OF FOLDERS PRESENT IN THAT

import java.io.*;

public class Demo3 {

	public static void main(String[] args) {
		File f = new File("E:\\");
		String[] lst = f.list();
		
		for(String str: lst) {
			File f2 = new File(f, str);
			
			if(f2.isFile()) {
				if(str.endsWith(".jpg")) {
					System.out.println("JPG file " + str);
				}
				if(str.endsWith(".txt")) {
					System.out.println("TXT file " + str);
				}
			} 
			
			
		}
		

	}

}
