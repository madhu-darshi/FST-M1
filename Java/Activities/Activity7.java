package activities;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(10, 2, 18);
		mb.speedUp(24);
		mb.applyBrake(2);
		System.out.println("The description of cycle are "+mb.bicycleDesc());
		
	}

}
interface BicycleParts{

    public int tyres = 2;
    public int maxSpeed = 25;

}

interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
	
}

class Bicycle implements BicycleParts,BicycleOperations{
	public int gears;
    public int currentSpeed;
    
	Bicycle(int gears, int currentSpeed){
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	public void applyBrake(int decrement) {
		currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
	}
	
	public void speedUp(int increment) {
		currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
		
	}
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
	}
}

class MountainBike extends Bicycle{
	public int seatHeight;
	
	MountainBike(int gears, int currentSpeed,int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight = seatHeight;
		// TODO Auto-generated constructor stub
	}
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	@Override
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed+" with a seatheight of "+seatHeight);
	}
	
}
