package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Own way
		/*
		 * int[] arr = {10,77,-52,10,10,7,10};
		 * int fixedVal = 30; int expectedVal = 0;
		 * for (int i = 0; i < arr.length; i++) 
		 * { if (arr[i] == 10) {
		 *  expectedVal = expectedVal + arr[i]; } 
		 *  }
		 * 
		 * if (expectedVal == fixedVal) { System.out.println("True"); }else {
		 * System.out.println("False"); }
		 */

		Activity2 obj1 = new Activity2();
		int[] arr1 = { 10, 77, -54, 10, 10, 10 };
		int searchNum = 10;
		int finalSum = 30;

		System.out.println("Does the sum equal to 30? : " + obj1.result(arr1, searchNum, finalSum));
	}

	public boolean result(int[] nums, int searchNum, int fixedSum) {
		int expectedSum = 0;

		for (int num : nums) {
			if (num == searchNum) {
				expectedSum += searchNum;
			}

			if (expectedSum > fixedSum) {
				break;
			}
		}
		return expectedSum == fixedSum;
	}

}
