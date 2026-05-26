package Assignments.Day3;
class Vehicle {
	public void drive() {
		System.out.println("Driving a vehicle");
	}
	}
class Car extends Vehicle {
	public void drive() {
		System.out.println("Repairing a car");
	}	
}
public class VehicleTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.drive();
	}

}
