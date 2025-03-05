package activities;

public class Activity12 {

	public static void main(String[] args) {
		
		//one way
		Addable ad1 = (num1,num2)->(num1+num2);
		System.out.println(ad1.add(10,200));
		
		//second way
		Addable ad2 = (int num1, int num2) -> {
			return num1 + num2;
		};
		System.out.println(ad2.add(20, 20));

	}

}
interface Addable{
	
	int add(int num1, int num2);
}
