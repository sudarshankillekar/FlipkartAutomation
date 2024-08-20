package seleniumSnippets;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDate {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/bus/");
//	    Thread.sleep(5000);
//	    Alert alert = driver.switchTo().alert();
//        alert.accept();
		WebElement element = driver.findElement(By.id("datepicker"));
        	element.click();
        	Thread.sleep(5000);
        
        String Month = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
        System.out.println(Month);  
        String year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
        System.out.println(year); 
        
        while(!(Month.equals("November") && year.equals("2024")) ) {
        	driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
        	 Month = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
        	 year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
        }
        driver.findElement(By.xpath("//a[contains(text(),\"3\")]")).click();
	}

}
