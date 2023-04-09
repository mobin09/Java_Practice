package opps;

public class LaunchWrapperDemo1 {
    static Integer i2;
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

		Boolean b12 = true;
		boolean b2 =b12.booleanValue();
		System.out.println(b2);
		
		int i = Integer.parseInt("10");
		boolean b5 = Boolean.parseBoolean("Mobin");
		double d = Double.parseDouble("10.01");
		System.out.println(i);
		System.out.println(b5);
		System.out.println(d);
		
		Integer y = 10;
		String z= y.toString();
		System.out.println(z);
		
		//String Binary 
		String s1 = Integer.toString(7, 2);
		System.out.println(s1);
		String s2 = Integer.toString(117, 2);
		System.out.println(s2);
		
		String s3 = Integer.toBinaryString(20);
		System.out.println(s3);
		String s4 = Integer.toOctalString(140);
		System.out.println(s4);
		String s5 = Integer.toHexString(15098765);
		System.out.println(s5);
		
		Integer ii = Integer.valueOf(10);
		Boolean b1 = Boolean.valueOf(true);
		if(b1) {
			System.out.println("Hello");
		}
		
		//int i3 = i2; // nullPointerException bcz of Integer default value is null
		System.out.println(i2);
		// All wrapper class is immutable
		Integer i3 = 10;
		Integer i4 = i3;
		i3++;
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i3 == i4);
		
		Integer i5= 10;
		Integer i6 = 10;
		System.out.println(i5 == i6);
		
		
		Integer a = 100;
		Integer a1 = 100;
		System.out.println(a == a1);
		
		Integer z1 = 1000;
		Integer z2 = 1000;
		System.out.println(z1 == z2);
		
		
	}

}
