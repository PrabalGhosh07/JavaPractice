package day3;

public class VehicleInheritance {
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.drive();
	}

}
class Vehicle{
	void start(){
		System.out.println("Vehicle Started");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Car is driving");
	}
}

