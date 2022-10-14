package com.xyz.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.rest.api.model.Students;
import com.xyz.uni.rest.api.service.StudentService;

//mark class as Controller  
@RestController

public class StudentsController {

//autowire the StudentService class 
	
	@Autowired
	StudentService studentService;

//creating a get mapping that retrieves all students from the database
	@GetMapping("/students")
	private List<Students> getAllStudents() {
		return studentService.getAllStudents();
	}

//creating a get mapping that retrieves a specific student 
	@GetMapping("/students/{studentid}")
	private Students getStudent(@PathVariable("studentid") int studentid) {
		return studentService.getStudentById(studentid);
	}

//creating post mapping that post students in the database  
	@PostMapping("/students")
	private int saveStudent(@RequestBody Students student) {
		studentService.saveOrUpdate(student);
		return student.getStudentId();
	}

}
