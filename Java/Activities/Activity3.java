package activities;

//import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Taking user inout for age
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter your age");
		 * int age = sc.nextInt(); double seconds = age * 365 * 86400;
		 */
		double seconds = 825000000;
		double EarthSec = 31557600;
		double MercurySec = 0.2408467;
		double VenusSec = 0.61519726;
		double MarsSec = 1.8808158;
		double JupiterSec = 11.862615;
		double SaturnSec = 29.447498;
		double UranusSec = 84.016846;
		double NeptuneSec = 164.79132;
		
		System.out.println("Age on Earth : "+seconds / EarthSec );
		System.out.println("Age on Mercury : "+seconds / EarthSec / MercurySec);
		System.out.println("Age on Venus : "+seconds / EarthSec / VenusSec);
		System.out.println("Age on Mars : "+seconds / EarthSec / MarsSec);
		System.out.println("Age on Jupiter : "+seconds / EarthSec / JupiterSec);
		System.out.println("Age on Saturn : "+seconds / EarthSec / SaturnSec);
		System.out.println("Age on Uranus : "+seconds / EarthSec / UranusSec);
		System.out.println("Age on Neptune : "+seconds / EarthSec / NeptuneSec);
	}

}
