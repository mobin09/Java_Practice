package TestGson;

import java.io.Serializable;

public class Employee implements Serializable{
	public String name;
	private int id;
	private String salary;
	private int rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", rating=" + rating + ", getName()="
				+ getName() + ", getId()=" + getId() + ", getSalary()=" + getSalary() + ", getRating()=" + getRating()
				+ "]";
	}

}
