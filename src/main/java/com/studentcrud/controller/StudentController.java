package com.studentcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentcrud.dto.Student;
import com.studentcrud.service.Studentservice;

@RestController
public class StudentController 
{
	@Autowired
	Studentservice stdser;
	
	@PostMapping("student")
//	@ResponseBody
	public Student savestudent(@RequestBody Student student)
	{
		return stdser.savestudent(student);
	}
	
	@PostMapping("students")
//	@ResponseBody
	public List<Student> savestudents(@RequestBody List<Student> students)
	{
		return stdser.savestudent(students);
	}
	
	@GetMapping("student1")
	
	public Student fetchbyId(@RequestParam int id)
	{
		return stdser.fetchbyId(id);
	}
	

	@GetMapping("studentname")
	
	public Student fetchbyName(@RequestParam String  name)
	{
		return stdser.fetchbyName(name);
	}
	
@GetMapping("studentmobile")
	
	public Student fetchbyMobile(@RequestParam long  mobile)
	{
		return stdser.fetchbyMobile(mobile);
	}

@GetMapping("studentpercentage")

public Student fetchbyPercentage(@RequestParam double percentage)
{
	return stdser.fetchbyPercentage(percentage);
}

@GetMapping("studentstandard")

public Student fetchbyStandard(@RequestParam int standard)
{
	return stdser.fetchbyStandard(standard);
}


}
