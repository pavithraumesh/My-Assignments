package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WindowHandling {

	public static void main(String[] args) {
		
		// Disable browser notifications (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");

        //Launch the browser
		ChromeDriver driver = new ChromeDriver(options);

        // Maximize the window
        driver.manage().window().maximize();

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Load the IRCTC website
        driver.get("https://www.irctc.co.in/");

        // Close the initial alert/popup if present
        
        try {
            driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
            
        } catch (Exception e)
        
        {
        
        // No popup found – continue
        }

        // Store the parent window handle
        String parentHandle = driver.getWindowHandle();

        // Click on the "FLIGHTS" link
        driver.findElement(By.linkText("FLIGHTS")).click();

        // Get all window handles
        Set<String> allHandles = driver.getWindowHandles();

        // Convert Set to List for easy access by index
        List<String> windowList = new ArrayList<>(allHandles);

        // Switch to the child window (assumed to be at index 1)
        for (String handle : windowList) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Capture and print the title of the new window
        String flightWindowTitle = driver.getTitle();
        System.out.println("Title of Flight Window: " + flightWindowTitle);

        // Switch back to the parent window and close it
        driver.switchTo().window(parentHandle);
        driver.close(); // This only closes the parent tab

        // Switch back to the flight window (still open)
        for (String handle : windowList) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Optionally, continue operations in the flight window
        
        System.out.println("Switched to Flight Window Successfully.");

        // Cleanup: Close all windows (optional)
        
        //driver.quit();
    }
}
		
