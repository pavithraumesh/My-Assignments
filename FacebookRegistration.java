package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class FacebookRegistration {

	public static void main(String[] args) {
		// ChromeOptions
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("guest");
	    
	    //ChromeDriver
		ChromeDriver driver = new ChromeDriver(options);

		//Load the url - get
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        
        //Click on the Create new account button. 
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        
        //Enter the First name. 
		driver.findElement(By.name("firstname")).sendKeys("Arvind");
        
        // Enter the Surname. 
		driver.findElement(By.name("lastname")).sendKeys("Babu");

        //Enter the Mobile number or email address. 
		driver.findElement(By.name("reg_email__")).sendKeys("allstar@gmail.com");

        // Enter the New password. 
		driver.findElement(By.id("password_step_input")).sendKeys("abcdef");
       
        // three dropdowns in Date of birth 
		
		//  Select Day 
        WebElement day = driver.findElement(By.id("day"));
        Select dropdown1 = new Select(day);
        dropdown1.selectByVisibleText("16");  // Select 15 day

        //  Select Month 
        WebElement month = driver.findElement(By.id("month"));
        Select dropdown2 = new Select(month);
        dropdown2.selectByVisibleText("Aug");  // Select August

        //  Select Year 
        WebElement year = driver.findElement(By.id("year"));
        Select dropdown3 = new Select(year);
        dropdown3.selectByVisibleText("1996");  // Select year 1996
        
        //Select the radio button in Gender.
        driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
	 		 
     	
		 		
	}

}
