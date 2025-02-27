package day_28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement search = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
        search.sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // List of search results
        List<WebElement> searchList = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));

        // Count of links
        System.out.println("Number of links: " + searchList.size());

        // Store the main window ID
        String mainWindow = driver.getWindowHandle();

        // Click each link to open in a new window
        for (WebElement link : searchList) {
            link.click();
        }

        // Get all window handles and store them in a List
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowsList = new ArrayList<>(windowHandles);

        System.out.println("\nList of Window IDs and Titles:");
        for (String window : windowsList) {
            driver.switchTo().window(window);
            String title = driver.getTitle();
            System.out.println("Window ID: " + window + " | Title: " + title );
            
            if(title.equals("Selenium (software) - Wikipedia")) {
            	System.out.println("closed window : "+title);
            	driver.close();
            }
        }
        driver.quit();
    }
}
