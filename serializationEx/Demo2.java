package serializationEx;

import java.io.*;

class Cat implements Serializable {
	String name = "Cat1";
	int age = 2;
}

class Dog1 implements Serializable {
	String name = "Dog1";
	int age = 5;
}

class Rat implements Serializable {
	String name = "Rat1";
	String age = "12 months";
}

public class Demo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Serializing the Objects");

		Cat c = new Cat();
		Dog1 d = new Dog1();
		Rat r = new Rat();

		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.writeObject(d);
		oos.writeObject(r);

		oos.flush();
		oos.close();

		// The order in which we are serializing the same order we have to Deserialized
		// it.

		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Cat c2 = (Cat) ois.readObject();
		Dog1 d2 = (Dog1) ois.readObject();
		Rat r2 = (Rat) ois.readObject();

		System.out.println("CAT:" + c2.name + "..." + c2.age);
		System.out.println("DOG:" + d2.name + "..." + d2.age);
		System.out.println("RAT:" + r2.name + "..." + r2.age);

		System.out.println("====Serialized and Deserialized=====");
		ois.close();

	}

}
