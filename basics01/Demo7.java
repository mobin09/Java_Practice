package basics01;

public class Demo7 {

	public static void main(String[] args) {
	    char ch = 'Z';
	    long l = 100_00l;
	    int i = 9_2;
	    float f = 2.02f;
	    double d = 10_0.35d;
	    
	    System.out.println("****BEFORE ANY OPERATION****");
	    System.out.println("char:"+ch+"\nlong:"+l+"\nint:"+i+"\nfloat:"+f +"\ndouble:"+d);
	    System.out.println("****END****");
	    System.out.println("****AFTER OPERATION****");
	    l = ch + i;
	    
	    f = ch * l * i *f;
	    f  = l + i +ch;
	    
	    i = (int)d;
	    f = (long)d;
	    System.out.println("char:"+ch+"\nlong:"+l+"\nint:"+i+"\nfloat:"+f +"\ndouble:"+d);
	    
	    // From JDK 1.7 for a literal we can give _ also, if we give _ compiler will remove _ from .class file
	    
   
	}

}
