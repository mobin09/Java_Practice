package opps;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String name;
	int rollNo;
	
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
}

public class ConstructorDemo1 {

	public static void main(String[] args) {
		Student s1 = new Student("Mobin", 102);
		Student s2 = new Student("Jashim", 103);
		Student s3 = new Student("Fahad", 104);
		
		ArrayList<Student> stus = new ArrayList<>();
		stus.add(s1);
		stus.add(s2);
		stus.add(s3);
       Iterator<Student> it = stus.iterator();
       
       while(it.hasNext()) {
    	   Student st = (Student)it.next();
    	   System.out.println("Name:"+st.name + " RollNo:"+st.rollNo);
       }
	}

}
