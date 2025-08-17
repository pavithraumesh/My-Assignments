package week4.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafTapsWindowHandling {

	public static void main(String[] args) {
		
		// Disable browser notifications (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");

        //Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		
		// Load the URL
        driver.get("http://leaftaps.com/opentaps/control/login");

        // Maximize the window
        driver.manage().window().maximize();

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Enter the username
      	driver.findElement(By.id("username")).sendKeys("DemoCSR");
      	//Enter the password
      	driver.findElement(By.id("password")).sendKeys("crmsfa");
       	//Click the Login button
      	driver.findElement(By.className("decorativeSubmit")).click();

      	// Click on the CRM/SFA link
      	driver.findElement(By.partialLinkText("CRM/SFA")).click();
      	
      	// Click on the Contacts button
      	driver.findElement(By.linkText("Contacts")).click();
      	
      	// Click on Merge Contacts
      	driver.findElement(By.linkText("Merge Contacts")).click();
      	
        // Click on the widget of the "From Contact"
      	driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
        
      	String parentWindow = driver.getWindowHandle();
      	Set<String> allWindows = driver.getWindowHandles();
      	for (String parent : allWindows) {
      		if (!parent.equals(parentWindow)) {
      			driver.switchTo().window(parent);
      			
        // Click on the first resulting contact
        driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
                       
      		}
      	}
      	driver.switchTo().window(parentWindow);
      	
      	//Click on the widget of the "To Contact"
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
      	allWindows = driver.getWindowHandles();
      	for (String parent : allWindows) {
      	if (!parent.equals(parentWindow))	{
      		driver.switchTo().window(parent);
      		driver.findElement(By.xpath("(//a[@class='linktext'])[2]")).click();
      	}
      	 	}
      	driver.switchTo().window(parentWindow);
      	// Click Merge and Handle Alert
      	driver.findElement(By.className("buttonDangerous")).click();
      	driver.switchTo().alert().accept();
      	
      	//Verify
      	
      	if(driver.getTitle().contains("View Contact")) {
      		System.out.println("Merge successful");
      	} else {
      		System.out.println("Merge failed");
      	}
      	driver.quit();
      	
      	}
} 	
      	
      	
    