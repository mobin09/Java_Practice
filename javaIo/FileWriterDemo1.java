package javaIo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("abc.txt");
			fw.write(65);
			fw.write("\nMobin\nArshad");
			fw.write('\n');
			char[] ch = {'a', 'b', 'c'};
			fw.write(ch);
			fw.write('\n');
			fw.flush();
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
