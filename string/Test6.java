package string;

class Test6 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("The value of PI is:");
		sb.append(3.141+" ");
		sb.append(true);
		sb.append("Hello I like it");
		sb.delete(sb.length()-5, sb.length());
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("mobin");
		sb2.delete(1, 3);
		System.out.println(sb2);
		

	}

}
