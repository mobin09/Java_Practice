package serializationEx;

import java.io.*;

class Dog2 implements Serializable{
	Cat2 c = new Cat2();
}

class Cat2 implements Serializable{
	Rat2 r = new Rat2();
}

class Rat2 implements Serializable{
	int j = 20;
}


public class SerializedGraph {

	public static void main(String[] args) throws Exception {
		Dog2 d = new Dog2();
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(d);
		
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog2 d2 = (Dog2)ois.readObject();
		System.out.println(d2.c.r.j);
		
		ois.close();

	}

}
