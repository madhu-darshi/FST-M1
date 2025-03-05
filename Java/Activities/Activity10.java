package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("run");
		hs.add("won");
		hs.add("gun");
		hs.add("pin");
		hs.add("win");
		hs.add("kin");
		
		//size
		System.out.println("The size if the HashSet is :"+hs.size());
		//removing
		hs.remove("gun");
		System.out.println(hs);
		//removing a ele which is not present
        if(hs.remove("Madhu")) {
        	System.out.println("Madhu removed from the Set");
        } else {
        	System.out.println("Madhu is not present in the Set");
        }
		
		System.out.println("using cntains :"+hs.contains("kin"));
		System.out.println(hs);
		System.out.println();
		
	}

}
