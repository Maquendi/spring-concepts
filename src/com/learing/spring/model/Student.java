package com.learing.spring.model;

import java.sql.Date;
import java.util.Set;
import javax.persistence.Entity;

@Entity
public class Student{
	
   private boolean isActive;
   
   private Set<SchoolSubject> currentSubjectList; // currently subscribed subjects
   
   private Set<SchoolSubject> passedSubjects; // 
   
   private Date schoolEnrollmentDate; // the date when this student enroll
   
   private String studentIdentificationNumber; // number given by college, university

public boolean isActive() {
	return isActive;
}

public void setActive(boolean isActive) {
	this.isActive = isActive;
}

public Set<SchoolSubject> getCurrentSubjectList() {
	return currentSubjectList;
}

public void setCurrentSubjectList(Set<SchoolSubject> currentSubjectList) {
	this.currentSubjectList = currentSubjectList;
}

public Set<SchoolSubject> getPassedSubjects() {
	return passedSubjects;
}

public void setPassedSubjects(Set<SchoolSubject> passedSubjects) {
	this.passedSubjects = passedSubjects;
}

public Date getSchoolEnrollmentDate() {
	return schoolEnrollmentDate;
}

public void setSchoolEnrollmentDate(Date schoolEnrollmentDate) {
	this.schoolEnrollmentDate = schoolEnrollmentDate;
}

public String getStudentIdentificationNumber() {
	return studentIdentificationNumber;
}

 public void setStudentIdentificationNumber(String studentIdentificationNumber) {
	this.studentIdentificationNumber = studentIdentificationNumber;
 }
   	
}
