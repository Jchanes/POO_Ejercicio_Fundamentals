package com.generation.sales;

import com.generation.employee.Employee;

public class SalesRep extends Employee{
	double salesMade;
	
	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,double salary, int yearsWorked){
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}//constructor
	
	double calculateComission(Double salesMade) {
		double comission = salesMade*0.1;
		return comission;
	}//calculateComission

	public double getSalesMade() {
		return salesMade;
	}//getSalesMade

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}//setSalesMade
	
	
}//class SalesRep
