package com.generation.employee;

import javax.swing.BoundedRangeModel;

public class Employee {
	String firstName;
	String lastName;
	int registration;
	int age;
	int daysWorked;
	int vacationDaysTaken;
	double salary;
	int yearsWorked;
	
	
	
	public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}//constructor

	///funciones
	public int timeToRetirement(int age){
		//retirement year 60
		int currentyear= 2024;
		int retireyear = 60-age; 
		return retireyear;
	}//timeToRetirement
	
	public int vacationTimeLeft(int vacationDaysTaken){
		//annual leave per year 12days
		int vacationsleft = 12-vacationDaysTaken;
		return vacationsleft;
	}//vacationTimeLeft
	
	
	public double calculateBonus(float salary){
		//bonus 2xSalary
		double bonus = salary=salary+salary*2;
		return bonus;
	}//function bonus

	public String getFirstName() {
		return firstName;
	}//getFirstName

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}//setFirstName

	public String getLastName() {
		return lastName;
	}//getLastName

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}//setLastName

	public int getRegistration() {
		return registration;
	}//getRegistration

	public void setRegistration(int registration) {
		this.registration = registration;
	}//setRegistration

	public int getAge() {
		return age;
	}//getAge

	public void setAge(int age) {
		this.age = age;
	}//setAge

	public int getDaysWorked() {
		return daysWorked;
	}//getDaysWorked

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}//setDaysWorked

	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}//getVacationDaysTaken

	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}//setVacationDaysTaken

	public double getSalary() {
		return salary;
	}//getSalary

	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary

	public int getYearsWorked() {
		return yearsWorked;
	}//getYearsWorked

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}
	
	
}//class Employee
