package string;

class Test1 {

	public static void main(String[] args) {
	   String s = "Hello I am String";
	   String s1 = new String("String can also be created like this");
	   System.out.println(s1);
	   System.out.println(s);
	   
	   String name = "Mobin"; // in name is Mobin
	    name.concat("Arshad");// concat
	   
	   System.out.println(name);
	   
	   StringBuilder sb = new StringBuilder("Mobin");
	   sb.append("Arshad");
	   
	   String s2 = "Abc";
	   String s3 = new String("Abc");
	   System.out.println(s2 == s3);
	   System.out.println(s2.equals(s3));
	  
	   StringBuffer sb1 = new StringBuffer("Mobin");
	   StringBuffer sb2 = new StringBuffer("Mobin");
	   System.out.println("StringBuffer");
	   System.out.println(sb1 == sb2);
	   System.out.println(sb1.equals(sb2));
	   
	   StringBuilder sb3 = new StringBuilder("Mobin");
	   StringBuilder sb4 = new StringBuilder("Mobin");
	   System.out.println("StringBuilder");
	   System.out.println(sb3 == sb4);
	   System.out.println(sb3.equals(sb4));
	   
	   
	}

}
