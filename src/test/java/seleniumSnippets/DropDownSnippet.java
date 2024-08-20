package seleniumSnippets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSnippet {

	public static void main(String[] args) {
		
	WebDriver driver;
	 
	driver = new ChromeDriver();
	
	driver.get("https://selectorshub.com/xpath-practice-page/");
	
	WebElement dropdownElement = driver.findElement(By.xpath("//select[@name = \"cars\"]")); 
	Select element = new Select(dropdownElement);
	dropdownElement.click();
	element.selectByVisibleText("Opel");
	dropdownElement.click();
	element.selectByIndex(1);
	dropdownElement.click();
	element.selectByValue("volvo");
	driver.quit();
		

	}

}
