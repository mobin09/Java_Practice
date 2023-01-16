package javaIo;

import java.io.*;

import java.util.*;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		fw.write(97);
		fw.write("\n");
		fw.write("Enjoying to write the code");
		fw.write("\n");
		char[] ch = {'M', 'O', 'B', 'I', 'N'};
		fw.write(ch);
		
		fw.close();
		
		System.out.println("Open abc.txt to see the result");
		
		
		
		
        
	}

}
