package javaIo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) {
		File f = new File("abc1.txt");
		char[] ch = new char[(int) f.length()];

		try {
			FileReader fr = new FileReader(f);
			fr.read(ch);
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (char ch1 : ch) {
			System.out.print(ch1);
		}

	}

}
