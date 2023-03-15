package com.studentcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentcrud.dao.StudentDao;
import com.studentcrud.dto.Student;

@Service
public class Studentservice {
	
	@Autowired
	StudentDao stddao;

	public Student savestudent(Student student)
	{
		 student.setPercentage((student.getEnglish_marks()+student.getHindi_marks()+student.getMaths_marks())/3);
		return stddao.savestudent(student);
	}

	public List<Student> savestudent(List<Student> students) {

for(Student student:students)
{
	 student.setPercentage((student.getEnglish_marks()+student.getHindi_marks()+student.getMaths_marks())/3);
}
		return stddao.savestudents(students);
	}
	

	public Student fetchbyId(int id) {


		return stddao.findbyId(id);
	}

	public Student fetchbyName(String name) {
		
		return stddao.findbyName(name);
	}

	public Student fetchbyMobile(long mobile) {
		
		
		return stddao.findbyMobile(mobile);
	}

	public Student fetchbyPercentage(double percentage) {
		
		return stddao.findbyPercentage(percentage);
	}

	public Student fetchbyStandard(int standard) {
		
		return stddao.findbyStandard(standard);
	}

	
	
}
