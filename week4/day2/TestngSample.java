package week4.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngSample {
	
		public  ChromeDriver	driver;
		{
				driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  		}		
		@Test		
		 public void loginPage() {
			 	 	 
		  driver.get("http://leaftaps.com/opentaps/control/main");
			}
		  		}
		
