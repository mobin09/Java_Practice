package serializationEx;


import java.io.*;


class Dog implements Serializable{
	int i=10;
	int j =20;
	transient String password = "Abcd";
}

public class Demo1 {

	public static void main(String[] args)  throws IOException, ClassNotFoundException{
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		oos.flush();
		oos.close();
		
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 =  (Dog)ois.readObject();
		System.out.println(d2.i+ "......" + d2.j + " " + d2.password);  
		
		

	}

}
