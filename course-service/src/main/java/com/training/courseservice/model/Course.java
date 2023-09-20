package com.training.courseservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long couseId;
	private String courseName;
	private int year;
	private int credit;
	
	public Course() {}
	
	public Course(long couseId, String courseName, int year, int credit) {
		super();
		this.couseId = couseId;
		this.courseName = courseName;
		this.year = year;
		this.credit = credit;
	}
	/**
	 * @return the couseId
	 */
	public long getCouseId() {
		return couseId;
	}
	/**
	 * @param couseId the couseId to set
	 */
	public void setCouseId(long couseId) {
		this.couseId = couseId;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the credit
	 */
	public int getCredit() {
		return credit;
	}
	/**
	 * @param credit the credit to set
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Course [couseId=" + couseId + ", courseName=" + courseName + ", year=" + year + ", credit=" + credit
				+ "]";
	}
	
	

}
