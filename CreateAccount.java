package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		
		// Click on the Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		// Click on the Create Account link
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an Account Name
		driver.findElement( By.id("accountName")).sendKeys("All Star");
		
		//Enter a description as "Selenium Automation Tester"
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		

		// Step1: Find the dropdown element for industry
		WebElement sourceElement1 = driver.findElement(By.name("industryEnumId"));		
			
		//Step2: Select-Create an Object
		Select dropdown1 = new Select(sourceElement1);
				
		// Step3: Use the method to Select - 3 Methods
		 dropdown1.selectByValue("IND_SOFTWARE");
		 
		// Step4: Find the dropdown element for OwnerShip
		WebElement sourceElement2 = driver.findElement(By.name("ownershipEnumId"));		
			
		//Step5: Select-Create an Object
		Select dropdown2 = new Select(sourceElement2);
					
		// Step6: Use the method to Select - 3 Methods
		dropdown2.selectByVisibleText("S-Corporation");
		
		
		       // Step: Find the dropdown element for source
				WebElement sourceElement3 = driver.findElement(By.name("dataSourceId"));		
					
			   //Step: Select-Create an Object
				Select dropdown3 = new Select(sourceElement3);
		
		       // Select "Employee" as the source using SelectByValue.
		        dropdown3.selectByValue("LEAD_EMPLOYEE");
		
		
		//Step: Find the dropdown element for marketing campaign
		WebElement sourceElement4 = driver.findElement(By.id("marketingCampaignId"));		
			
		//Step: Select-Create an Object
		Select dropdown4 = new Select(sourceElement4);
		
		// Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		dropdown4.selectByIndex(6);
		
		
		        //Step: Find the dropdown element for state/province
				WebElement sourceElement5 = driver.findElement(By.id("generalStateProvinceGeoId"));		
					
				//Step: Select-Create an Object
				Select dropdown5 = new Select(sourceElement5);
		
		       //Select "Texas" as the state/province using SelectByValue.
		       dropdown5.selectByValue("TX");
		
		      //Click the "Create Account" button.
		      driver.findElement(By.className("smallSubmit")).click();

	}

}
