package javaIo;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		//System.out.println(f.exists());
		f.createNewFile();
		//System.out.println(f.exists());
		
		File abc = new File("mobin");
		//System.out.println(abc.exists());
		abc.mkdir();
		//System.out.println(abc.exists());
		
		File m  = new File("Mobin123");
		m.mkdir();
		File a = new File(m, "demo.txt");
		a.createNewFile();
		
		//System.out.println("Done");
		//System.out.println(m.isDirectory());
		//System.out.println(a.isFile());
		
//		File fl = new File("K:\\");
//		String[] st= fl.list();
//		for(String str: st) {
//			//System.out.println(str);
//		}
		
		long l = f.length();
		System.out.println(l);
		
		//f.delete();
		m.delete();
		//a.delete();
		//abc.delete();
		
		

	}

}
