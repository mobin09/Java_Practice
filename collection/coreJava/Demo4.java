package collection.coreJava;

// Generics
import java.util.ArrayList;
import java.util.List;


interface ABcd {
	
}

class Abcderfg{
	
}

enum Level implements ABcd{
	LOW, MEDIUM,HIGH;
	 Level() {
		System.out.println("enum Level Constructor is called");
	}
}

enum Campus {
	NORTH, SOUTH, EAST, WEST;
}

enum Gender {
	MALE, FEMALE, OTHER;
}

class MyGen<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

class Demo4 {

	public static void main(String[] args) {
		List lst = new ArrayList(); // Without Generics we can store any type of Objects
		lst.add(10);
		lst.add("10");
		System.out.println(lst);

		// with generics we can store the specific type of Objects
		List<Integer> list = new ArrayList<>();
		list.add(10);
		// list.add("10"); compile time error
		System.out.println(list);

		MyGen<String> gen = new MyGen<String>();
		gen.add("Mobin Arshad");
		// gen.add("Khan");
		System.out.println(gen.get());
		System.out.println(gen);

	   Level l = Level.MEDIUM;
	   String s = l.getClass().getName();
	   
	   Level[] lv = Level.values();
	   for(int i=0; i<lv.length; i++) {
		   System.out.println(lv[i]);
	   }
	   
	   for(Level lvs: Level.values()) {
		   System.out.println(lvs.ordinal() + ":" + lvs.name());
		   
	   }
	   
	   

	}

}
