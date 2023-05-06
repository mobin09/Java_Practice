package collection.coreJava;

// Generics
import java.util.ArrayList;
import java.util.List;
class Demo4 {

	public static void main(String[] args) {
		List lst = new ArrayList(); // Without Generics we can store any type of Objects
		lst.add(10);
		lst.add("10"); 
		System.out.println(lst);
		
		// with generics we can store the specific type of Objects
		List<Integer> list = new ArrayList<>();
		list.add(10);
		//list.add("10"); compile time error
		System.out.println(list);
		
        
	}

}
