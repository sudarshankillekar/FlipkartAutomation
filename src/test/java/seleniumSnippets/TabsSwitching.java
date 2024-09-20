package seleniumSnippets;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsSwitching {

	public static void main(String[] args) throws InterruptedException {

    WebDriver driver;
    
    driver = new ChromeDriver();
    
    driver.get("https://www.easemytrip.com/bus/");
    driver.manage().window().maximize();
    String parent = driver.getWindowHandle();
    Thread.sleep(5000);
    WebElement element = driver.findElement(By.xpath("//div[@class = \"swiper-slide swiper-slide-duplicate swiper-slide-prev\"]"));
    element.click();
    Set<String> windowHandles = driver.getWindowHandles();
    for(String windowHandle : windowHandles) {
    	if(!windowHandle.equals(parent)) {
    		driver.switchTo().window(windowHandle);
    		Thread.sleep(5000);
    		driver.findElement(By.linkText("FLIGHTS")).click();
    		driver.close();
    		driver.switchTo().window(parent); 		
    	}
    }
    

	}

}
