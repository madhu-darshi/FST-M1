package activities;

import java.util.Arrays;

public class Activity4 {
	
	public static void ascendingSort(int array[]) {
		int size = array.length , i;//declaring multiple variables
		for (i = 1;i < size; i++) {
			int key = array[i];
			int j = i-1;
			
		while (j >=0 && key < array[j]) {
			array[j+1] = array[j];
			--j;
		}
		array[j+1] = key;
		}
	}
	public static void bubbleSort(int array[]) {
		int size = array.length , i, temp;
		for (i = 0; i < size; i++) {
			for (int j = i+1; j < size;j++) {
				if ( array[i] > array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] a = {4, 3, 2, 10, 12, 1, 5, 6};
		ascendingSort(a);
		System.out.println("The array in Ascending order");
		System.out.println(Arrays.toString(a));//printing a array if we dirctly print it just prints the val of heap area
		
		bubbleSort(a);
		System.out.println("The array in Ascending order using Bubble sort");
		System.out.println(Arrays.toString(a));

	}

}
