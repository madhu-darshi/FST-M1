package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist = new ArrayList<>();
		
		//add 5 values
		mylist.add("Man");
		mylist.add("Can");
		mylist.add("Tan");
		mylist.add("Van");
		mylist.add("San");
		mylist.add(5, "Jam");
		
		System.out.println(mylist);
		for (String fr:mylist) {
			System.out.println(fr);
		}
		
		System.out.println("The size of teh array is : "+mylist.size());
		System.out.println("The string contains apple ?: "+mylist.contains("apple"));
		System.out.println("5th ele in the list : "+mylist.get(5));
		System.out.println("index of Van is : "+mylist.indexOf("Van"));
		//remove
		mylist.remove(1);
		mylist.remove("San");//this works only if the list is string
		
		System.out.println("Size after the element is removed: "+mylist.size());
		System.out.println(mylist);
	}

}
