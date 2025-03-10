package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/login-form/");
		driver.manage().window().maximize();
		//page title
		System.out.println("Current title is " +driver.getTitle());
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String msg = driver.findElement(By.xpath("//h1[@class = 'text-center font-display text-6xl font-bold text-emerald-500']")).getText();
		System.out.println(msg);
		//driver.quit();

	}

}
