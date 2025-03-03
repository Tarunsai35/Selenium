package day_32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_32 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://blazedemo.com/");

        WebElement FindFlightButton = driver.findElement(By.xpath("//input[@value='Find Flights']"));
        FindFlightButton.click();
        Thread.sleep(2000);

        // Find all price elements
        List<WebElement> listPrice = driver.findElements(By.xpath("//table[@class='table']//td[6]"));
        System.out.println("Total prices found: " + listPrice.size());

        // Store prices in a list
        List<Double> prices = new ArrayList<>();

        for (WebElement priceElement : listPrice) {
            String priceText = priceElement.getText().replace("$", "").trim();
            try {
                double price = Double.parseDouble(priceText);
                prices.add(price);
            } catch (NumberFormatException e) {
                System.out.println("Error parsing price: " + priceText);
            }
        }

        // Find the index of the lowest price
        double lowestPrice = Collections.min(prices);
        int lowestPriceIndex = prices.indexOf(lowestPrice); // Get index dynamically

        // Display lowest price
        System.out.println("Lowest Price: $" + lowestPrice);
        System.out.println("Lowest Price Index: " + lowestPriceIndex);

        // Find all "Choose This Flight" buttons
        List<WebElement> chooseButtons = driver.findElements(By.xpath("//table[@class='table']//td[1]/input"));

        // Click the button at the index of the lowest price
        if (lowestPriceIndex != -1) {
            chooseButtons.get(lowestPriceIndex).click();
            System.out.println("Clicked the button for the lowest price flight.");
        } else {
            System.out.println("No valid prices found.");
        }

        
        driver.findElement(By.id("inputName")).sendKeys("sai");
        driver.findElement(By.id("address")).sendKeys("saibalajitowers");
        driver.findElement(By.id("city")).sendKeys("city");
        driver.findElement(By.id("state")).sendKeys("state");
        driver.findElement(By.id("zipCode")).sendKeys("562314");
        
        WebElement dropdown = driver.findElement(By.id("cardType"));
        Select sc = new Select(dropdown);
        sc.selectByValue("visa");
        
        driver.findElement(By.id("creditCardNumber")).sendKeys("014785203690");
        driver.findElement(By.id("creditCardMonth")).sendKeys("05");
        driver.findElement(By.id("creditCardYear")).sendKeys("2025");
        driver.findElement(By.id("nameOnCard")).sendKeys("sai");
        
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
        
         WebElement conformation = driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']"));
         boolean status = conformation.isDisplayed();
        if(status== true) {
        	System.out.println(conformation.getText());
        }else {
        	System.out.println("Failed");
        }
    }
}
