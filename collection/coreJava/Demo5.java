package collection.coreJava;

import java.util.TreeSet;

public class Demo5 {
    public static void main(String[] args) {
    	TreeSet<String> ts = new TreeSet<>();
    	ts.add("A");
    	ts.add("Z");
    	ts.add("L");
    	ts.add("B");  	
    	//System.out.println(ts);
    	
    	
    	TreeSet ts1 = new TreeSet();
    	ts1.add("A");
    	ts1.add("B");
    	//ts1.add(null); // RE: NullPointerException
    	//ts1.add(10); RE: ClassCastException
    	
    	//System.out.println(ts1);
    	
    	TreeSet<StringBuffer> ts2 = new TreeSet<>();
    	ts2.add(new StringBuffer("A"));
    	ts2.add(new StringBuffer("Z"));
    	ts2.add(new StringBuffer("L"));
    	ts2.add(new StringBuffer("B"));
    	System.out.println(ts2);
    	
    	
    	
    	
    	
    }
}
