package basics01;


public class Demo2 {

	public static void main(String[] args) {
		int Runnable  = 10;
        //System.out.println(Runnable);
        int Integer = 10;
        //System.out.println(Integer);
        //System.out.println(Byte.SIZE);
        //System.out.println(Byte.MIN_VALUE);
        //System.out.println(Byte.MAX_VALUE);
        int a = 25;
        float b = 2.0f;
        float c = (a/b);
        double d = a/b;
        //System.out.println(d); // 12.0
        //System.out.println(d); // 12.0
        double m =0.0;
        double n = 0.0;
        //System.out.println(m/n);
        
        long l =0l;
        long l2 = 0l;
        //System.out.println(l/l2); // AE
        
        byte b1 = 45;
        double d1;
        d1 = b1; // implict type casting
        System.out.println(d1);
        
        double d2 = 135.0;
        byte b2;
        b2 = (byte)d2; // explicitly type casting narrowing loss of data
        //System.out.println(b2);
        
        byte ab = 10;
        byte ac = 20;
        byte res  = (byte) (ab * ac);
        
        
        
        
	}

}
