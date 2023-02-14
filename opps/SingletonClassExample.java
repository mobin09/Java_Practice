package opps;


 class Test12{
	 private static Test12 t = new Test12();
	 private Test12() {}
	public static Test12 getTest(){
		 return t;
	 }
	 
 }


public class SingletonClassExample {

	public static void main(String[] args) {
		Test12 test = Test12.getTest();
		Test12 test2 = Test12.getTest();
		
		System.out.println(test.equals(test2));
		

	}

}
