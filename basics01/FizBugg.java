package basics01;

import java.util.List;
import java.util.ArrayList;
public class FizBugg {

	public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

      for(int i=1; i<=n; i++){
          if(i % 3 == 0 && i % 5== 0){
              list.add("FizzBuzz");
          } else if(i % 3 == 0){
              list.add("Fizz");
          } else if(i % 5 == 0) {
              list.add("Buzz");
          } else{
              list.add(String.valueOf(i));
          }
      }
        return list;

    }
	
	public static void main(String[] args) {
		 List<String> s = fizzBuzz(3);
		 System.out.println(s);

	}

}
