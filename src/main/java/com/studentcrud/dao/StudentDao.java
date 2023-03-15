package com.studentcrud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studentcrud.dto.Student;
import com.studentcrud.repository.StudentRepository;

@Component
public class StudentDao {

	
	@Autowired
	StudentRepository stdrepo;
	
	public Student savestudent(Student student)
	{
		return stdrepo.save(student);
	}

	public List<Student> savestudents(List<Student> students) {
		
		return stdrepo.saveAll(students);
	}

	public Student findbyId(int id) {
		
	Optional<Student>	op= stdrepo.findById(id);
		if(op.isPresent())
		{
			return op.get();
		}
		else
			return null;
	}

	public Student findbyName(String name) {

	return stdrepo.findByName(name);
	
	}

	public Student findbyMobile(long mobile) {

		
		return stdrepo.findByMobile(mobile);
	}

	public Student findbyPercentage(double percentage) {

		return stdrepo.findByPercentage(percentage);
	}

	public Student findbyStandard(int standard) {
		
		return stdrepo.findByStandard(standard);
	}

	
	
	
	
}
