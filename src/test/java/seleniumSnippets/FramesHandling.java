package seleniumSnippets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(10000); 
		driver.switchTo().frame("pact1");
		
		WebElement element1 = driver.findElement(By.xpath("//input[@placeholder = \"Destiny\"]"));
		element1.sendKeys("test");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@placeholder = \"Destiny\"]"));
	    element.sendKeys("test");
	}

}
