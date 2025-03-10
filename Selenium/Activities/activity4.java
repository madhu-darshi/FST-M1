package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/target-practice");
		
		System.out.println("The title is : " +driver.getTitle());
		
		//Find the 3rd header on the page and print it's text to the console.
		System.out.println("3rd hearder on the page is :" +driver.findElement(By.xpath("//h3[text() = 'Heading #3']")).getText());
	    
	    //Find the 5th header on the page and print it's color.
		System.out.println("5th hearder on the page is :" +driver.findElement(By.xpath("//h5[text() = 'Heading #5']")).getCssValue("Color"));
	    

	    //Find the purple button and print all it's classes.
		System.out.println("The class of purple button is: "+driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class"));
	   
		//Find the slate button and print it's text.
		System.out.println("The text on Slate button is : "+driver.findElement(By.xpath("//button[text()='Slate']")).getText());
		
		
		driver.close();

	}

}
