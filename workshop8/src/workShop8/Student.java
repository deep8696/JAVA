package workShop8;

import java.text.DecimalFormat;

public class Student{
	
	private String firstName;
	private String lastName;
	private double grade;
	private String department;

	// Constructor
	
	public Student(String firstName, String lastName, double grade, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.department = department;
	}

	// Getters firstname
	public String getFirstName() {
		return firstName;
	}
	//getter lastname		
	public String getLastName() {
		return lastName;
	}
	//getter grade
	public double getGrade() {
		return grade;
	}
	//getter department
	public String getDepartment() {
		return department;
	}

	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getName() {
		return getFirstName() + " " + getLastName();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		
		} else {
			return false;
		}
	}	

	@Override
	public String toString() {	
		return getFirstName() + "\t" + getLastName() + "\t\t" + String.format("%4.1f", getGrade()) +"\t" + getDepartment();
	}
}