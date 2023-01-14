package javaIo;

import java.io.*;

public class RemoveDuplicateNo {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("output.txt");
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String line = br.readLine();
		
		while(line != null) {
			BufferedReader br2 = new BufferedReader(new FileReader("output.txt")); 
			String line2 = br2.readLine();
			boolean isAvailable = false;
			
			while(line2 != null) {
				
				if(line.equals(line2)) {
					isAvailable = true;
					break;
				}
				
				line2 = br2.readLine();
			}
			
			
			if(isAvailable == false) {
				pw.println(line);
				pw.flush();
			}
			
			br2.close();
			
			line = br.readLine();
			
		}
		
		
		pw.flush();
		pw.close();
		br.close();

	}

}
