package day_32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Total no of rows in tables
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		 System.out.println("Number of rows : "+rows.size());
		
//		 List<WebElement> rows = driver.findElements(By.tagName("tr"));
//		 System.out.println("Number of rows : "+rows.size());
		 
		 //Total no of columns in table
		 List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
		 System.out.println("Number of Columns : "+columns.size());
		
//		 List<WebElement> columns = driver.findElements(By.tagName("th"));
//		 System.out.println("Number of Columns : "+columns.size());
		 
		 	//read data from specific row and column (5th row and 1st col)
//		 	String cell = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
//		 	System.out.println(cell);
//		 
//		 	String cell1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
//		 	System.out.println(cell1);
//		 	
		 	System.out.println();
		 	
		 	//read data from rows and col
//		 	for(int i=2;i<rows.size();i++) {
//		 		for(int j=1;j<columns.size();j++) {
//		 			String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
//		 				System.out.println(value+"  \t  ");
//		 		}
//		 		System.out.println();
//		 	}

		 	// print book name whose author name is mukesh
//		 	for(int i=1;i<rows.size();i++) {
//		 		 String authorname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
//		 		 System.out.println(authorname);
//		 		 if(authorname.equals("mukesh")) {
//		 			 String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
//		 			 System.out.println(bookname+"\t"+authorname);
//		 		 }
//		 		 
//		 	}
		 	
		 	System.out.println();
//		 	
		 	// find the total price of all books
		 	int total =0;
		 	for(int a=2;a<=rows.size();a++) {
		 		String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+a+"]//td[4]")).getText();
		 		System.out.println(price);
		 		   total = total + Integer.parseInt(price);
		 	}
		 	System.out.println(total);
		 	
		 	
		 	
		 	
		 	
		 	driver.quit();
	}
}
