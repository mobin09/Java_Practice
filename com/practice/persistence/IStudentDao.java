package com.practice.persistence;

public interface IStudentDao {
	
	public String addStudent(String name, java.sql.Date dob, String address);

	public String searchStudent(Integer id);

	public String updateStudent(Integer id, String name, java.sql.Date dob, String address);

	public String deleteStudent(Integer id);

}
