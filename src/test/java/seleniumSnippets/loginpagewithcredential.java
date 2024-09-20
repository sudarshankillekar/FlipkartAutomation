package seleniumSnippets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpagewithcredential {

	public static void main(String[] args) {
		
	WebDriver driver;
	 driver = new ChromeDriver(); 
	 driver.get("https://www.saucedemo.com/");
	 
	   String Username = driver.findElement(By.xpath("//div[@class = \"login_credentials\"]")).getText();
	   String Password = driver.findElement(By.xpath("(//div[@class='login_password'])[1]")).getText();
	  
	   String [] SplitedString = Username.split("\n");  
	   String index3 = null;
	   for (int i = 0; i < SplitedString.length; i++) {
		    String usernames = SplitedString[i].trim(); 
		    if (i == 3) {
		     index3 = usernames;
		        break;  
		    }
		}
   
	   String [] Splitedpassword =Password.split("\n");  
	   String index1 = null;
	   for (int i = 0; i < Splitedpassword.length; i++) {
		    String Passwords = Splitedpassword[i].trim(); 
		    if (i == 1) {
		     index1 = Passwords;
		        break;  
		    }
		}
	  System.out.println(index1);
	    
	   driver.findElement(By.xpath("//input[@placeholder = \"Username\" ]")).sendKeys(index3);
	   driver.findElement(By.xpath("//input[@placeholder = \"Password\" ]")).sendKeys(index1);
	   driver.findElement(By.xpath("//input[@class = \"submit-button btn_action\" ]")).click(); 
	 
}
}