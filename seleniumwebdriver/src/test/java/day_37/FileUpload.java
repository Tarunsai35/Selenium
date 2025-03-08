package day_37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\Dinesh\\Pictures\\Screenshots\\party\\B2B_Products");
//		
//		// single upload
//		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("B2B_Products")) {
//			System.out.println("sucessfully upload");
//		}else {
//			System.out.println("upload failed.....");
//		}
		
		//multi upload
		String file1 = "C:\\Users\\Dinesh\\Pictures\\Screenshots\\party\\B2B_Products\\Banana Tree.webp";
		String file2 = "C:\\Users\\Dinesh\\Pictures\\Screenshots\\party\\B2B_Products\\Blueberry.webp";
		
		driver.findElement(By.id("filesToUpload")).sendKeys(file1+"\n"+file2);
		
		int Filecount = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(Filecount==2) {
			System.out.println("All files upload");
		}else {
			System.out.println("file upload failed...");
		}
		
		
	}
}
