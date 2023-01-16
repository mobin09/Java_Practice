package javaIo;

import java.io.*;

public class Demo8 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		pw.write(100); //d
		pw.println();
		pw.println('d');
		pw.println("Hello I am learning the Java Full stack development");
		pw.println(true);
		pw.print(10.45);

		pw.flush();
		pw.close();
		
		System.out.println("TO see the result look abc.txt");
		
	}

}
