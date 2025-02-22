package day_25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		//Self - Select the Current node
		String Text = driver.findElement(By.xpath("//a[contains(text(),'Shyam')]/self::a")).getText();
		System.out.println("Self : "+Text);
		
		//Parent - Select the Parent of the current node
		Text = driver.findElement(By.xpath("//a[contains(text(),'Shyam')]/parent::td")).getText();
		System.out.println("Parent : "+Text);

		//Child - Selects all childern of the current mode  
		List<WebElement> Child = driver.findElements(By.xpath("//a[contains(text(),'Shyam')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements : "+Child.size());
		
		//Ancestor - select all ancestors (parent, garndparent)
		Text = driver.findElement(By.xpath("//a[contains(text(),'Shyam')]/ancestor::tr")).getText();
		System.out.println("Ancestor : "+Text);
		
		//Descendant - Select all descendants(Children, grandparents, etc) of current node
		List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(),'Shyam')]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant node : "+descendant.size());
		
		//Following - Select everything in the document after the closing tag of the current mode
		List<WebElement> Followingnodes = driver.findElements(By.xpath("//a[contains(text(),'Shyam')]/ancestor::tr/following::tr"));
		System.out.println("Number of Following node : "+Followingnodes.size());
		
		//preceding - select all node that appear before the current node in the document
		List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'Shyam')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of Preceding Node : "+preceding.size());
		
		
		
		
		
	}
}
