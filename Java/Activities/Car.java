package activities;

public class Car {
	String color, transmission;
	int make, tyres, doors;

	// Constructor class
	public Car(String color, String trans, int make) {
		this.color = color;
		this.transmission = trans;
		this.make = make;
		this.doors = 4;
		this.tyres = 4;
	}

	public void accelerate() {
		System.out.println("Car is moving forward");
	}

	public void brake() {
		System.out.println("Car has stopped");
	}

	public void displayCharacteristics() {
		System.out.println("The Color of the car is " + this.color + 
				"\nTransmission is " + this.transmission
				+ " and the year made is " + this.make + 
				"\nIt has " + this.doors + " doors with " + this.tyres+ " tyres");
	}

}
