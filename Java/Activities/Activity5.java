package activities;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new MyBook();
		book1.setTitle("Veer Savarkar");
		System.out.println("the title of the book is: "+book1.getTitle());
	}
}

abstract class Book {
	String title;

	// abstract method
	abstract void setTitle(String s);

	// Concrete method
	String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	public void setTitle(String s) {
		title = s;
	}
}
