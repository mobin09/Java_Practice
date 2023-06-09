package com.practice.service;

import java.util.ArrayList;

import com.practice.dto.Student;

public interface IStudentService {
	public String addStudent(String name, java.sql.Date dob, String address);

	public String searchStudent(Integer id);

	public String updateStudent(Integer id, String name, java.sql.Date dob, String address);

	public String deleteStudent(Integer id);

	public ArrayList<Student> showAllStu();
}
