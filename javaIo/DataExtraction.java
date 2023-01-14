package javaIo;

import java.io.*;

public class DataExtraction {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("file3.txt");

		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		String line1 = br1.readLine();

	

		while (line1 != null) {
			BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
			String line2 = br2.readLine();
			int count = 1;
			while (line2 != null) {
				if (line1.equals(line2)) {
					count = 0;
					break;
				}

				line2 = br2.readLine();
			}

			if (count == 1) {
				pw.println(line1);
			}
			br2.close();
			line1 = br1.readLine();

		}

		pw.flush();
		br1.close();
		
		pw.close();

	}

}
