package string;

class Test10 {

	public static char[] reverseStr(char[] str) {
		int i=0;
		int j = str.length-1;
		String s = "";
		while(i < j) {
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;		
			i++;
			j--;
		}
		return str;
	}
	
	public static void main(String[] args) {
		String str = "Mobin Arshad";
	    String s = new String(reverseStr(str.toCharArray()));
	    
	    
	    System.out.println(s);

	    String[] arr = {"Mobin",  "Arshad"};
	    for(int i=0; i<arr.length; i++) {
	    	String s1 = new String(reverseStr(arr[i].toCharArray()));
	    	System.out.print(s1+" ");
	    }
	    
	    System.out.println();
	    
	    String abc  = "Abcd Xyz CDEF";
	    
	    String[] strArr = abc.split(" ");
	    int i=0;
	    int j= strArr.length-1; 
	    while(i <j ) {
	    	String temp = arr[i];
	    	strArr[i] = strArr[j];
	    	strArr[j] = temp;
	    	
	    	i++;
	    	j--;
	    	
	    }
	    
	    for(String ab: strArr) {
	    	System.out.print(ab+" ");
	    }
	    
	    
	    
	    
	}

}
