package basics01;


class Student{
	String name;
	Integer id;
	Integer sage;
    Student(String name, Integer id, Integer sage){
    	this.name = name;
    	this.id = id;
    	this.sage = sage;
    }
    
    public String toString() {
    	return "S_name: "+ name + " S_id: "+ id +" S_age: "+sage;
    }
    
}

public class Demo3 {

	public static void main(String[] args) {
		Student s1 = new Student("Mobin Arshad", 23, 24);
		System.out.println(s1);
		
	    Student s2 = new Student("Jashim Arshad", 005, 15);
        System.out.println(s2);
		
	}

}
