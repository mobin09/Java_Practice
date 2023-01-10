package javaIo;

import java.io.*;

public class BufferedWriterDemo1 {

	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("abc1.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(65);
		bw.newLine();
		char[] ch = {'A', 'B', 'C'};
		bw.write(ch);
		bw.newLine();
		bw.write("Mobin");
		bw.newLine();
		bw.write("Arshad Khan");
		bw.newLine();
		
		bw.flush();
		bw.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
