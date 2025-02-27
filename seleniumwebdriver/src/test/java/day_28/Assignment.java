package day_28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

        for (int i = 0; i < searchList.size(); i++) {
            searchList.get(i).click(); // Click each link

            // Get all open window handles
            Set<String> windowHandles = driver.getWindowHandles();

            // Switch to the newly opened tab
            for (String window : windowHandles) {
                if (!window.equals(mainWindow)) {
                    driver.switchTo().window(window);
                    String title = driver.getTitle();
                    System.out.println("Window ID " + i + " : " + window + " | Title: " + title);

                    // Close the window if the title matches
                    if (title.equals("Selenium disulfide - Wikipedia")) {
                        System.out.println("Closing window: " + window);
                        driver.close();
                    }

                    // Switch back to the main window after closing
                    driver.switchTo().window(mainWindow);
                }
            }
        }

        driver.quit();
    }
}
