package string;

/**
 * String is the immutable class
 * All Wrapper class is the Immutable class
 * 
 * In this program I am writing custom immutable class
 * 
 */

public class ImmutableClass {

	private int x;
	ImmutableClass(int x){
		this.x = x; 
	}
	
	public ImmutableClass checkImmutability(int x) {
		if(this.x == x) {
			return this;
		}else {
		return new ImmutableClass(x);
		}
	}
	
	
	public static void main(String[] args) {
		ImmutableClass m1 = new ImmutableClass(10);
		ImmutableClass m2 = m1.checkImmutability(100);
		ImmutableClass m3 = m1.checkImmutability(10);
		
		System.out.println(m1 == m2);
		System.out.println(m1 == m3);

	}

}
