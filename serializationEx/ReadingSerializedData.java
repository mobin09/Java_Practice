package serializationEx;

import java.io.*;

public class ReadingSerializedData {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		  Object o= (Object)ois.readObject();
		  
		 while(o != null) {
			 if(o instanceof Dog1) {
				  Dog1 d2 = (Dog1)o;
				  System.out.println("Name:" + d2.name + " Age:" + d2.age);			  
			  } else if(o instanceof Cat) {
				  Cat c = (Cat)o;
				  System.out.println("Name:" +c.name + " Age:"+ c.age);
			  }else if(o instanceof Rat) {
				  Rat r = (Rat)o;
				  System.out.println("Name:" +r.name +" Age: " + r.age);
			  }
			 
			 
			o = ois.readObject(); // we will get the Exception at this line --: java.io.EOFException
			 
		 }
		  
		
		
		 
		 
		 ois.close();
		 
		 
		  
		

	}

}
