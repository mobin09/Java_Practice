package serializationEx;


import java.io.*;

class BankAccount implements Serializable{
	 String userName = "Mobin";
	 transient String pwd = "Abcd";
	 
	 private void writeObject(ObjectOutputStream os) throws IOException {
		 os.defaultWriteObject();
		 String epwd = "123"+pwd;
		 os.writeObject(epwd);
	 }
	 
	 private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
		 is.defaultReadObject();
		 String epwd = (String)is.readObject();
		 pwd = epwd.substring(3);
	 }
	 
}

public class CustomizedSerilizationEx {

	public static void main(String[] args) throws Exception {
		   
		  BankAccount acc = new BankAccount();
		  System.out.println("Username:"+acc.userName+"\nPassword:"+acc.pwd);
		
		  FileOutputStream fos = new FileOutputStream("abc.txt");
          ObjectOutputStream oos = new ObjectOutputStream(fos);
          oos.writeObject(acc);
          
          oos.flush();
          oos.close();
          
          FileInputStream fis = new FileInputStream("abc.txt");
          ObjectInputStream ois = new ObjectInputStream(fis);
          BankAccount acc2 = (BankAccount)ois.readObject();
          
          System.out.println("Final Username:"+acc2.userName+"\nFinal Password:"+acc2.pwd);
          ois.close();
          
          
	}

}
