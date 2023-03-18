package opps;


/**
 * Write A program to create a number of Objects
 * @author mobin
 *
 */

public class NumberOfObject {

	static int count = 0;
	
	{
		count++;
	}
	
	NumberOfObject(){
		System.out.println("no-arg construcotr");
	}
	NumberOfObject(int i){
		System.out.println("int-arg constructor");
	}
	
	NumberOfObject(double d){
		System.out.println("Double arg constructor");
	}
	
	NumberOfObject(String str){
		System.out.println("String Arg Constructor");
	}
	
	NumberOfObject(int i, String str){
		System.out.println("int-string arg constructor");
	}
	
	
	
	
	public static void main(String[] args) {
		NumberOfObject o1 = new NumberOfObject();
		NumberOfObject o2 = new NumberOfObject(30);
		NumberOfObject o3 = new NumberOfObject(30.5);
		NumberOfObject o4 = new NumberOfObject("Mobin Arshad");
		NumberOfObject o5 = new NumberOfObject();
		
		System.out.println(NumberOfObject.count);
		

	}

}
