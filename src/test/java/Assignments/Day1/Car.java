package Assignments.Day1;

public class Car {
	String brand;
	String model;
	double price;
	
	void startCar() {
		System.out.println("Car started");
	}
	void stopCar() {
		System.out.println("Car stopped");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.brand="Maruti";
		c.model="Baleno";
		c.price=8000000;
		System.out.println("Brand : " + c.brand);
		System.out.println("Model : " + c.model);
		System.out.println("Price : " + c.price);
		c.startCar();
		c.stopCar();
				
	}

}
