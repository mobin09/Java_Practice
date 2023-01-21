package serializationEx;

import java.io.*;

class Account implements Serializable {
	String username = "mobin";
	transient String pwd = "abcd";
}

public class Demo3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a1 = new Account();
		System.out.println(a1.username+"....."+a1.pwd);
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 =  (Account)ois.readObject();
		
		ois.close();
		System.out.println(a2.username +":===:"+a2.pwd);
		
		

	}

}
