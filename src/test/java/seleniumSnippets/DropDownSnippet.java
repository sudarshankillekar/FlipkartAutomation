package seleniumSnippets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownSnippet extends loginpagewithcredential {

	public static void main(String[] args) {
		
	WebDriver driver;
	 
	driver = new ChromeDriver();
	
    driver.get("https://www.saucedemo.com/"); 
    driver.findElement(By.xpath("//input[@placeholder = \"Username\" ]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@placeholder = \"Password\" ]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@class = \"submit-button btn_action\" ]")).click(); 	
//   driver.quit();
	 By xpatsh =   By.xpath("//span[@class = \"select_container\"]");        
	
	WebDriverWait Wwait = new WebDriverWait(driver, Duration.ofSeconds(5));
    WebElement clikondropdown =  Wwait.until(ExpectedConditions.visibilityOfElementLocated(xpatsh));	
    clikondropdown.click();
    
    By xpatshs =   By.xpath("//select[@class = \"product_sort_container\"]");
    WebElement clikondropdowns =  Wwait.until(ExpectedConditions.visibilityOfElementLocated(xpatshs));	
    clikondropdown.click();
    Select select = new Select(clikondropdowns);
    select.selectByIndex(1);
    clikondropdowns.click();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    select.selectByValue("lohi");
    clikondropdowns.click();
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   select.selectByVisibleText("Name (Z to A)");
   clikondropdowns.click();
	}

}
