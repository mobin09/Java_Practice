package javaIo;

import java.io.*;

public class Demo5 {

	public static void firstWayToRead() throws IOException {
		File f = new File("abc.txt");
		FileReader f1 = new FileReader(f);

		int i = f1.read();
		while (i != -1) {
			System.out.print((char) i);
			i = f1.read();
		}

		f1.close();

		System.out.println("To see the result looks to console");
	}

	public static void secondWayToRead() throws IOException {
		File f = new File("abc.txt");
		FileReader f1 = new FileReader(f);
		char[] ch = new char[(int)f.length()];
		
		f1.read(ch);
		
		for(char data: ch) {
			System.out.print(data);
		}
	
		f1.close();
		System.out.println();
		
		System.out.println("This is the fun to write code");
	}
	
	public static void main(String[] args) throws IOException {
		secondWayToRead();
	}

}
