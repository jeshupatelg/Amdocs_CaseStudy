package com.training.courseservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student {
	
	private long id;
	private String name;
	private int roll;
	private char grade;
	public Student(String name, int roll, char grade) {
		super();
		this.name = name;
		this.roll = roll;
		this.grade = grade;
	}
	
	public Student() {}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the roll
	 */
	public int getRoll() {
		return roll;
	}

	/**
	 * @param roll the roll to set
	 */
	public void setRoll(int roll) {
		this.roll = roll;
	}

	/**
	 * @return the grade
	 */
	public char getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
}
