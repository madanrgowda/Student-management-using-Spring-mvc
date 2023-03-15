package com.studentcrud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentcrud.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByName(String name);

	Student findByMobile(long mobile);

	Student findByPercentage(double percentage);

	Student findByStandard(int standard);

	
	
	

}
