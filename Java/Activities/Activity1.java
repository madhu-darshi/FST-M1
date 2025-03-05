package activities;


public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car MG =new Car("Blue","Manual",2024);
		Car bmw = new Car("Black","Automatic",2025);
		
		
		/*this can also be used
		 * alto.color = "red"; alto.make = 2023; alto.transmission = "Manual";
		 */
		
		MG.displayCharacteristics();
		MG.accelerate();
		MG.brake();
		System.out.println();
		bmw.displayCharacteristics();
		bmw.accelerate();
		bmw.brake();

	}

}
