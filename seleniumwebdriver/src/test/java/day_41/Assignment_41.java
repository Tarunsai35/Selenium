package day_41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_41 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator\r\n");
		driver.manage().window().maximize();
		
		//File path
		String file = System.getProperty("user.dir")+"\\testdate\\caldata.xlsx";
		
		// finding total rows
		int TotalRows = ExcelUtils.getRowCount(file, "sheet2");
		
		for(int i=1;i<=TotalRows;i++) {
			
			//read excel data 
			String InitialDep = ExcelUtils.getCellData(file, "sheet2", i, 0);
			String length = ExcelUtils.getCellData(file, "sheet2", i, 2);
			String InterestRate = ExcelUtils.getCellData(file, "sheet2", i, 1);
			String Compounding = ExcelUtils.getCellData(file, "sheet2", i, 3);
			String Exp_Total = ExcelUtils.getCellData(file, "sheet2", i, 4);
			System.out.println(Exp_Total);
			
			//Add to application
			WebElement InitailDepAmo = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			InitailDepAmo.clear();
			InitailDepAmo.sendKeys(InitialDep);
			
			WebElement len = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			len.clear();
			len.sendKeys(length);
			
			WebElement IntRate = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
			IntRate.clear();
			IntRate.sendKeys(InterestRate);
			
//			Select Comdrp = new Select(driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c102-3']//mat-select")));
//			Comdrp.selectByVisibleText(Compounding);
			
			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
			
			String Act_Total = driver.findElement(By.id("displayTotalValue")).getText();
			Act_Total = Act_Total.replace("$", "").replace(",", "").trim();
			System.out.println(Act_Total);
			
			// validation of Amount
			if(Double.parseDouble(Exp_Total)== Double.parseDouble(Act_Total)) {
				System.out.println("Test Case Passed.......");
				ExcelUtils.setCellData(file, "sheet2", i, 6, "Pass");
				ExcelUtils.fillGreenColor(file, "sheet2", i, 6);
			}else {
				System.out.println("Test Case Failed.......");
				ExcelUtils.setCellData(file, "sheet2", i, 6, "fail");
				ExcelUtils.fillRedColor(file, "sheet2", i, 6);
			}
			Thread.sleep(3000);
		}
		
		
	}

}
