package EmployeePlayrollSystem;

abstract class Employee {
	String name;
	int empId;
	public Employee(String name2, int empId2) {
		this.name=name;
		this.empId=empId;
	}
	
	abstract double calculateSalary();
	
	public void display() {
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name :"+name);
	}	
}

class FullTimeEmployee extends Employee{
	
	double monthlySalary;
	
	public FullTimeEmployee(String name, int empId,double monthlySalary) {
		super(name,empId);
		this.monthlySalary=monthlySalary;
		
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}
	
}

class PartTimeEmployee extends Employee{
	
	int hoursWorked;
	double ratePerhour;
	
	public PartTimeEmployee(String name, int empId,int hoursWorked, double ratePerhour) {
		super(name,empId);
		this.hoursWorked=hoursWorked;
		this.ratePerhour=ratePerhour;
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return hoursWorked*ratePerhour;
	}
	
}
