package com.generation.sales;

import java.util.HashMap;

import com.generation.employee.Employee;

public class SalesManager extends Employee{
	
	HashMap<Integer, SalesRep> salesTeam = new  HashMap<>();
	
	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,int vacationDaysTaken, double salary, int yearsWorked) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesTeam = salesTeam;
	}//constructor

	public HashMap<Integer, SalesRep> getSalesTeam() {
		return salesTeam;
	}//getSalesTeam

	public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
		this.salesTeam = salesTeam;
	}//setSalesTeam
	
	
	
	
	
}//class Sales Manager
