package EmployeePlayrollSystem;

public class PayRoleSystem {
	public static void main(String[] args) {
		Employee e1=new FullTimeEmployee("Prabal",10, 30000);
		Employee e2=new PartTimeEmployee("Raja", 8, 240, 300);
		
		e1.display();
		System.out.println("Salary: "+e1.calculateSalary());
		
		e2.display();
		System.out.println("Salary: "+e2.calculateSalary());
	}

}
