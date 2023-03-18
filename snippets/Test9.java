package snippets;

class Test9 {

	public static void main(String[] args) {
		int a =3;
		m(++a, a++);
		System.out.println(a);

	}
	
	static void m(int i, int j) {
		i++;
		j--;
	}
	

}
