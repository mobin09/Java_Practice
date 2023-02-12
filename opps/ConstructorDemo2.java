package opps;

public class ConstructorDemo2 {

	static int count = 0;
	
	{
		count++;
	}
	
	ConstructorDemo2(){
		// ...
	}
	ConstructorDemo2(int i){
		//...
	}
	ConstructorDemo2(double d){
		//...
	}
	
	public static void main(String[] args) {
		ConstructorDemo2  o1 = new ConstructorDemo2();
		ConstructorDemo2 o2 = new ConstructorDemo2(10);
		ConstructorDemo2 o3 = new ConstructorDemo2(10.5);
		
		System.out.println("The no. of Objects Created:"+ count);
		

	}

}
