package serializationEx;

import java.io.*;

class Bird {
	int leg = 2;
}

class Hen extends Bird implements Serializable{
	int tail = 1;
}



public class InheritanceSerializationEx2 {

	public static void main(String[] args) throws Exception{
		
		Hen h = new Hen();
		
		FileOutputStream fos =new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(h);
		
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Hen h2 = (Hen)ois.readObject();
		
		ois.close();
		
		System.out.println("Hen Leg:"+h2.leg +"\nHen Tail:"+h2.tail);
		
	}

}
