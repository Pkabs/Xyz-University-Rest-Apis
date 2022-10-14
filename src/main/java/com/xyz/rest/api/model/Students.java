package com.xyz.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity
@Entity

//defining class name as Table name
@Table
public class Students {

//Defining student ID as primary key
@Id
@Column
private int studentId;  

@Column
private String studentName;

@Column
private String studentDetails;

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getStudentDetails() {
	return studentDetails;
}

public void setStudentDetails(String studentDetails) {
	this.studentDetails = studentDetails;
}

}
