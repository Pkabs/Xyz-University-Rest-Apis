package com.xyz.uni.rest.apis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.uni.rest.apis.model.Students;
import com.xyz.uni.rest.apis.repository.StudentsRepository;

//defining the business logic  
@Service
public class StudentService {

	@Autowired
	StudentsRepository studentsRepository;

	//getting all student records by using the method findaAll() of CrudRepository  
	public List<Students> getAllStudents() {
		List<Students> students = new ArrayList<Students>();
		studentsRepository.findAll().forEach(students1 -> students.add(students1));
		return students;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Students getStudentById(int id) {
		return studentsRepository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Students students) {
		studentsRepository.save(students);
	}

}