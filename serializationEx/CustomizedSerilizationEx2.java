package serializationEx;

import java.io.*;

class BankAccount2 implements Serializable {
	String username = "Mobin";
	transient String pwd = "Abcd";
	transient int pin = 1234;

	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String epwd = "1234" + pwd;
		os.writeObject(epwd);

		int epin = 44444 + pin;
		os.writeInt(epin);

	}
	
  private void readObject(ObjectInputStream is) throws Exception {
	  is.defaultReadObject();
	  String epwd = (String)is.readObject();
	  pwd = epwd.substring(4);
	  
	  pin = is.readInt() - 44444;
	  
  }	
	
	

}

public class CustomizedSerilizationEx2 {

	public static void main(String[] args) throws Exception {
		BankAccount2 acc = new BankAccount2();
		System.out.println("UserName:" + acc.username + "\nPassword:" + acc.pwd + "\nPIN:" + acc.pin);

		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc);

		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		BankAccount2 acc2 = (BankAccount2) ois.readObject();
		System.out.println(
				"Final UserName:" + acc2.username + "\nFinal Password:" + acc2.pwd + "\nFinal PIN:" + acc2.pin);
		ois.close();

	}

}
