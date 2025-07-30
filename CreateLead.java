package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
	// ChromeOptions
    ChromeOptions options = new ChromeOptions();
    options.addArguments("guest");
    
    //ChromeDriver
	ChromeDriver driver = new ChromeDriver(options);

	//Load the url - get
	driver.get("http://leaftaps.com/opentaps/");
	
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Enter the username
	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	
	//Enter the password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	//Click the Login button
	driver.findElement(By.className("decorativeSubmit")).click();

	// Click on the CRM/SFA link
	driver.findElement(By.partialLinkText("CRM")).click();
	
	// Click on the Create Lead link
	driver.findElement(By.linkText("Create Lead")).click();
	
		// Enter first name
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");

	// Enter the last name
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Babu");
	
	// Enter company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	
	// Enter a Title
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Technicalsupport");
	
	// Click on the Create lead button
	driver.findElement(By.name("submitButton")).click();
	    

	}

}
