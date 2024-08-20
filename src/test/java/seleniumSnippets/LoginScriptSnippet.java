package seleniumSnippets;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptSnippet {

	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
    driver.get("https://selectorshub.com/xpath-practice-page/");
    
    WebElement Username = driver.findElement(By.xpath("//input[@placeholder = \"Enter email\"]"));
    WebElement Password = driver.findElement(By.xpath("//input[@placeholder = \"Enter Password\"]"));
    WebElement company = driver.findElement(By.xpath("//div[@class='element-companyId']//input[@placeholder='Enter your company']"));
    WebElement number = driver.findElement(By.xpath("//div[@class = \"element-companyId\"]//input[@placeholder = \"Enter your mobile number\"]"));
    WebElement SubmitButton = driver.findElement(By.xpath("//button[contains(text(),\"Submit\")]"));
      Username.sendKeys("Sudarshnan");
      Password.sendKeys("test");
      company.sendKeys("test");
      number.sendKeys("8904356647");
      SubmitButton.click();
      
      driver.quit();
    
	
     
	 
	
	}
	
}
