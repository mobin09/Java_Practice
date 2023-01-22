package serializationEx;

import java.io.*;

class Animal implements Serializable {
	int i = 10;
}

class Dog3 extends Animal {
	int j = 20;
}

public class InheritanceInSerialization {

	public static void main(String[] args) throws Exception {
		Dog3 d = new Dog3();
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog3 d2 = (Dog3)ois.readObject();
		ois.close();
		
		System.out.println("I value:"+d2.i +"\nJ Value:"+ d2.j);
		
		
	}

}
