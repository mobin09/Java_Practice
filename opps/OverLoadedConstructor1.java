package opps;

public class OverLoadedConstructor1 {

	OverLoadedConstructor1(){
		this(10);
		System.out.println("no-arg constructor");
	}
	
	OverLoadedConstructor1(int i){
		this(10.5);
		System.out.println("int-arg constructor");
	}
	
	OverLoadedConstructor1(double d){
		System.out.println("double-arg constructor");
	}
	
	
	public static void main(String[] args) {
		OverLoadedConstructor1 c = new OverLoadedConstructor1();
		OverLoadedConstructor1 c2 = new OverLoadedConstructor1(10);
		
		OverLoadedConstructor1 c3 = new OverLoadedConstructor1(10.6);
		OverLoadedConstructor1 c4 = new OverLoadedConstructor1(10l);
		

	}

}
