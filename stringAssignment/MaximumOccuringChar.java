package stringAssignment;
import java.util.HashMap;
import java.util.Map;

/**
 * WAP to find the maximum occurring character in a String.
 * 
 * @author Mobin Arshad
 *
 */

public class MaximumOccuringChar {

	public static void main(String[] args) {
		String str = "aaaabdbhfjeeueeemmmmmmm";		
		str = str.replace(" ", "").toLowerCase();
		
		HashMap<Character, Integer> map = new HashMap<>();
		String result = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				Integer x = map.get(ch);
				map.put(ch, ++x);
			}else {
				map.put(ch, 1);
			}
		}
		
		// traverse to the max
		int max = 0;
		
		for(Map.Entry<Character, Integer> m: map.entrySet()) {
			
		   if(m.getValue() >max) {
			   max = m.getValue();
			   result = String.valueOf(m.getKey());
		   }	
			
		}
		
		System.out.println("Maximum Occuring Character");
		System.out.println(result + " Occurs " + max + " time");
		
		
		

	}

}
