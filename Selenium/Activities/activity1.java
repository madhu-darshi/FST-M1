package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/");
		
		//page title
		System.out.println("Current title is " +driver.getTitle());
		
		driver.findElement(By.linkText("About Us")).click();
		
		String newTitle = driver.getTitle();
		System.out.println("Current title is " + newTitle);
		
		driver.quit();
	}

}
