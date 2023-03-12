package opps;

/**
 * Data hiding
 * 
 * @author mobin
 *
 */

class Student01 {
	private String name;
	private int age;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student01 [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}

class Test2 {

	public static void main(String[] args) {
		Student01 s1 = new Student01();
		s1.setName("Mobin");
		s1.setAge(24);
		s1.setCity("Delhi");
		System.out.println(s1);

	}

}
