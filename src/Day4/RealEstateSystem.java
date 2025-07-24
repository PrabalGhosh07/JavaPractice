package Day4;

import java.util.Scanner;

abstract class RentCalculator{
	abstract void tax(double rent);
}

class Apartment extends RentCalculator{

	@Override
	void tax(double rent) {
		double t=10*rent/100;
		double rent2=t+rent;
		System.out.println("Tax for Apartment rent is Rs."+t);
		System.out.println("Apartment Rent is Rs."+rent2);
		
	}
	
}

class House extends RentCalculator{

	@Override
	void tax(double rent) {
		double t=20*rent/100;
		double rent2=t+rent;
		System.out.println("Tax for Apartment rent is Rs."+t);
		System.out.println("Apartment Rent is Rs."+rent2);
		
	}
	
}
public class RealEstateSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rent catagory (Apartment/House) : ");
		String cat=sc.nextLine();
		System.out.println("Enter the Rent amount : ");
		double rent=sc.nextDouble();
		RentCalculator rc;
		if(cat.equalsIgnoreCase("Apartment")) {
			rc=new Apartment();
		}else if(cat.equalsIgnoreCase("House")) {
			rc=new House();
		}else {
			System.out.println("Invalid input");
			sc.close();
			return;
		}
		rc.tax(rent);
		sc.close();
		
		
	}

}
