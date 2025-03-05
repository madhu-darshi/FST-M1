package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane = new Plane(10);
		plane.onboard("Madhu");
		plane.onboard("Darshi");
		plane.onboard("Sahil");
		plane.onboard("Madhu");
		plane.onboard("Darshi");
		plane.onboard("Sahil");
		plane.onboard("Madhu");
		plane.onboard("Darshi");
		plane.onboard("Sahil");
		plane.onboard("Madhu");
		plane.onboard("Darshi");
		plane.onboard("Sahil");
		
		System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
        System.out.println("Plane is flying...");
        Thread.sleep(5000);
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
	}

}

class Plane{
	private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    Plane(int maxPassengers){
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<>();
    }
    
    public void onboard(String passenger) {
    	if (passengers.size() <= maxPassengers) {
    		this.passengers.add(passenger);
    	}else {
    		System.out.println("Plane is full");
    	}
    	
    	
    }
    public Date takeOff() {
    	this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    public void land() {
    	this.lastTimeLanded = new Date();
        this.passengers.clear();
    }
    public Date getLastTimeLanded() {
		return lastTimeLanded;    	
    }
    public List<String> getPassengers() {
    	return passengers;
    }
}
