package javaIo;

import java.io.*;

public class PrintWriterDemo1 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("abc1.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.write(100);
			pw.println(100);
			pw.println('c');
			pw.println(true);
			pw.println("Mobin");
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
