package string;


// Find out total how many objects are created and how many
// eligible for garbage collector

class Test2 {

	public static void main(String[] args) {
		String s = new String("Mobin");
        s.concat("Arshad");
        s += "IND";
        
        String s1 = s.concat("RahmatNagr");
        System.out.println(s);
        System.out.println(s1);
        
	}

}
