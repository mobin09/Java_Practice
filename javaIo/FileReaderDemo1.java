package javaIo;

import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class FileReaderDemo1 {

	public static void main(String[] args)  {
		
		try {
			FileReader	fr = new FileReader("abc1.txt");
			int i = fr.read();
			while( i != -1) {
				System.out.print((char)i);
				i = fr.read();
			}
			
			fr.close();
			
		} catch (IOException e) {
			
			String stx = "Hello Some issues while Reading the File";
			
			
		
			try {
				
				FileWriter fw = new FileWriter("demo.txt");
				fw.write(stx);
				fw.close();
								
				FileReader frdemo = new FileReader("demo.txt");
				int x = frdemo.read();
				while( x != -1) {
					System.out.print((char)x);
					x = frdemo.read();
				}
			
				frdemo.close();
					
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				
			}
		}
		finally {
			
		}

	}

}
