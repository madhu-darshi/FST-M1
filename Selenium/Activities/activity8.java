package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        
		Actions builder = new Actions(driver);

        // Open the browser
        driver.get("https://training-support.net/webelements/mouse-events");

        // Verify page title
        System.out.println("Page title is: " + driver.getTitle());
        
        //elements to be clicked
        WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
       // WebElement openOption = driver.findElement(By.xpath("//span[text() = 'Open']")); 
        //wont work here beacuse its a dynamic element
        
        //Task1 Left click on the Cargo.lock button, move the cursor to the Cargo.toml 
        //button and then click it. Print the confirmation text at the end of the sequence.
        builder.click(cargoLock).pause(2000).click(cargoToml).build().perform();       
        String actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        
        //Task 2 Double click on the src button. Then right click on the target button 
        //and select open. Print the confirmation text at the end of the sequence
        
        builder.doubleClick(srcButton).pause(1000).contextClick(targetButton).perform();
        builder.click(driver.findElement(By.xpath("//span[text() = 'Open']"))).pause(3000).build().perform();
        
        actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        
        
        
	}

}
