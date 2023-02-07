package opps;

public class Demo2 {

	public static void main(String[] args) {
		String s = new String("Mobin");
		Object o = (Object)s;
		
		System.out.println("String: "+s.hashCode() +" Object: "+ o.hashCode() );// both hash codes are equal
		
		System.out.println(s.equals(o));// true bcz both refers to the same object
		
		Integer i = new Integer(10);
		Number n = (Number)i;
		System.out.println(n==i); // true
		
		Object o1 =(Object) n;
		System.out.println(n==o1); // true
		
		

	}

}
