package javaIo;

import java.io.*;

public class BufferedReaderDemo1 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("abc1.txt"); 
		BufferedReader br = new BufferedReader(fr);
		String line ;
		
//		while(line != null) {
//			 System.out.println(line);
//			 line = br.readLine();
//		}
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();

	}

}
