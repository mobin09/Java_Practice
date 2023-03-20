package snippets;

class Counter{
	
	static int numOfObjects;
	
	static {
		numOfObjects++;
	}
	
	int count;
	public static void increment(Counter counter) {
		counter.count++;
	}
}

 class Test11 {

	public static void main(String[] args) {
	   Counter c1 = new Counter();
	   Counter c2 = c1;
	   System.out.println(c2 == c1);
	   Counter c3 = null;
	   c2.count = 1000;
	   Counter.increment(c2);
	   System.out.println(c1.count);
	   System.out.println(Counter.numOfObjects);
	   
	   String str = "UP TO DATE";
	   System.out.println(String.join("-", str.split(" ")));
	   
	   String[] s = {"abc", null, "df"};
	   String x = "";
	   for(String a: s) {
		   x += String.join("-", s);
	   }
	   
	   System.out.println(x);
	   
	   
	   
	  
	   

	}

}
