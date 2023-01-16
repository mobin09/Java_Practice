package javaIo;

import java.io.*;

public class Demo6 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.newLine();
		bw.write(65);
		bw.newLine();
		bw.write("Mobin Arshad");
		bw.newLine();
		char[] ch = {'J', 'A', 'V', 'A', ' ', 'F', 'U', 'L', 'L', 'S', 'T', 'A', 'C', 'K'};
		bw.write(ch);
		
		bw.flush();
		bw.close();
		
		System.out.println("TO see the result open the abc.txt");
		
		

	}

}
