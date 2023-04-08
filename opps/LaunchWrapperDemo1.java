package opps;

public class LaunchWrapperDemo1 {

	public static void main(String[] args) {
		//1. Integer
//		Integer i = new Integer(10); // deprecated from jdk 9
//		System.out.println(i);
//		System.out.println(i.hashCode());
//		Boolean b = new Boolean("true"); // deprecated from jdk 9
//		
		Integer x  = Integer.valueOf(10);
		x = Integer.valueOf("20");
		
		System.out.println(x);
		
		Boolean b = Boolean.valueOf("Mobin");
		
		b = Boolean.valueOf("TRuE");
		b = Boolean.valueOf(true);
		b = Boolean.valueOf("true");
				System.out.println(b);
				
				
		x = Integer.valueOf("1011011",35 );
		System.out.println(x);
		System.out.println("Radix defined in the Character class");
		System.out.println(Character.MAX_RADIX);
		System.out.println(Character.MIN_RADIX);
		
		String c = "true";
		boolean c1 = Boolean.parseBoolean(c);
		System.out.println(c1);
		
		Integer m = 40;
		
		System.out.println(m.byteValue());
		System.out.println(m.shortValue());
		System.out.println(m.intValue());
		System.out.println(m.longValue());
		System.out.println(m.floatValue());
		System.out.println(m.doubleValue());		    
		
		Character ch = 'M';
		char ch1 = ch.charValue();
		System.out.println(ch1);

		
		
	}

}
