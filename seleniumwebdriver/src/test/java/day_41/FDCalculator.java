package day_41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();

		String filePath = System.getProperty("user.dir") + "\\testdate\\caldata.xlsx";

		int noofRows = ExcelUtils.getRowCount(filePath, "sheet1");

		for (int i = 1; i <= noofRows; i++) {

			// Read data from excel
			String Principle = ExcelUtils.getCellData(filePath, "sheet1", i, 0);
			String RateofInterest = ExcelUtils.getCellData(filePath, "sheet1", i, 1);
			String period_1 = ExcelUtils.getCellData(filePath, "sheet1", i, 2);
			String Period_2 = ExcelUtils.getCellData(filePath, "sheet1", i, 3);
			String Frequency = ExcelUtils.getCellData(filePath, "sheet1", i, 4);
			String Exp_Mvalue = ExcelUtils.getCellData(filePath, "sheet1", i, 5);

			// Pass above data into Application
			driver.findElement(By.id("principal")).sendKeys(Principle);
			driver.findElement(By.id("interest")).sendKeys(RateofInterest);
			driver.findElement(By.id("tenure")).sendKeys(period_1);

			Select Perdrp = new Select(driver.findElement(By.id("tenurePeriod")));
			Perdrp.selectByVisibleText(Period_2);

			Select fredrp = new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(Frequency);

			driver.findElement(
					By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"))
					.click();

			// Validation
			String Act_Mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			if (Double.parseDouble(Exp_Mvalue) == Double.parseDouble(Act_Mvalue)) {
				System.out.println("Test Case passed......");
				ExcelUtils.setCellData(filePath, "sheet1", i, 7, "Pass");
				ExcelUtils.fillGreenColor(filePath, "sheet1", i, 7);
			} else {
				System.out.println("Test Case Faild......");
				ExcelUtils.setCellData(filePath, "sheet1", i, 7, "fail");
				ExcelUtils.fillRedColor(filePath, "sheet1", i, 7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click(); // Clear button
		}
		driver.quit();
	}

}
