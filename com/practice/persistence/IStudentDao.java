package com.practice.persistence;
import java.util.ArrayList;
import com.practice.dto.Student;

public interface IStudentDao {
	
	public String addStudent(String name, java.sql.Date dob, String address);

	public String searchStudent(Integer id);

	public String updateStudent(Integer id, String name, java.sql.Date dob, String address);

	public String deleteStudent(Integer id);
	
	public ArrayList<Student> showAllStu();

}
