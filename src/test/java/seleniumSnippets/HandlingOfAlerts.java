package seleniumSnippets;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingOfAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver ;
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement element = driver.findElement(By.xpath("//button[(contains(text(),\"Click To Open Window Alert\"))]"));
		element.click();
		WebElement element1 = driver.findElement(By.xpath("//button[(contains(text(),\"Click To Open Window Prompt Alert\"))]"));
		
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		element.click();
		String text = alert.getText();
		System.out.println(text);
		alert.dismiss();
		
		element1.click();
		Thread.sleep(3000);
		Alert promptAlert = driver.switchTo().alert();
		String text1 = promptAlert.getText();
		System.out.println(text1);
		promptAlert.sendKeys("test");
		promptAlert.accept();
		
		driver.close();	
	}

}
