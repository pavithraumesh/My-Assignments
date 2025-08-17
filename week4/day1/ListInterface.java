package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ListInterface {

	public static void main(String[] args)  {
		
		 // Setup Chrome with options to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Launch browser
        ChromeDriver driver = new ChromeDriver(options);
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to Amazon
        driver.get("https://www.amazon.in");

        // Search for phones
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Wait for results to load and capture all price elements
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

        List<Integer> priceList = new ArrayList<>();

        for (WebElement element : priceElements) {
            String priceText = element.getText().replace(",", "").trim();

            // Avoid blank or non-numeric entries
            if (!priceText.isEmpty() && priceText.matches("\\d+")) {
                int price = Integer.parseInt(priceText);
                priceList.add(price);
            }
        }

        // Sort the prices
        Collections.sort(priceList);

        // Print the lowest price
        if (!priceList.isEmpty()) {
            System.out.println("Lowest Phone Price on Amazon: ₹" + priceList.get(0));
        } else {
            System.out.println("No prices found.");
        }

        // Close browser
        driver.quit();
    }
}
