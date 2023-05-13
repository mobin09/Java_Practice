package opps;


import static java.lang.Math.sqrt;

import java.util.function.Predicate;;

@FunctionalInterface
interface Dmo{
	void disp();
}

interface Dmo1 {
	int add(int a, int b);
	void greet();
}

public class LaunchDate {

	public static void main(String[] args) {
      System.out.println(Math.max(5, 10));		
      System.out.println(sqrt(40)); // static import

      Dmo d= ()-> System.out.println("Display something::::::--> U are awesome");
      d.disp();
    
      Dmo1 ad = new Dmo1() {
    	  public int add(int a, int b) {
    		  return a+b;
    	  }
    	  
    	  public void greet() {
    		  System.out.println("Hello Java Inner Class");
    	  }
    	  
      };
      
      System.out.println(ad.add(6, 9));
      ad.greet();
      
      
      // write code to find num greater than 10 using predicate
      int[] nums = {2, 5, 7, 10, 9, 50, 0, 40};
      for(int num: nums) {
    	  Predicate<Integer> p = i-> i>=10;
    	  if(p.test(num)) {
    		  System.out.println(num);
    	  }
      }
      
      
      
	}

}
