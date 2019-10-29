package com.learing.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjects")
public class SchoolSubject {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long subjectId;
	
	private String subjectName;
	
	private int subjectCredits;
	
	private double subjectCreditCost;
	
	private String subjectCategory; // science, history, literature... etc.

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectCredits() {
		return subjectCredits;
	}

	public void setSubjectCredits(int subjectCredits) {
		this.subjectCredits = subjectCredits;
	}

	public double getSubjectCreditCost() {
		return subjectCreditCost;
	}

	public void setSubjectCreditCost(double subjectCreditCost) {
		this.subjectCreditCost = subjectCreditCost;
	}

	public String getSubjectCategory() {
		return subjectCategory;
	}

	public void setSubjectCategory(String subjectCategory) {
		this.subjectCategory = subjectCategory;
	}
	
}
