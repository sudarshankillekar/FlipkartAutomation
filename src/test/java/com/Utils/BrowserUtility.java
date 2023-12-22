package com.Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtility {

	private WebDriver wd;
	private WebDriverWait wait;

	public WebDriver getWd() {
		return wd;
	}

	public BrowserUtility() {
	}

	public BrowserUtility(WebDriver wd) {
		this.wd = wd;
		wait = new WebDriverWait(wd, Duration.ofSeconds(30));
	}

	public BrowserUtility(WebDriver wd, int timeToWaitSec) {
		this.wd = wd;
		wait = new WebDriverWait(wd, Duration.ofSeconds(timeToWaitSec));
	}

	public void launchBrowser() {
		wd = new ChromeDriver();
		wait = new WebDriverWait(wd, Duration.ofSeconds(30));
	}

	public void goToWebSite(String enterUrl) {
		wd.get(enterUrl);
	}

	public void sleepFor(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
    
	public void ChangingTabs( ) {
		String Ptab = wd.getWindowHandle();
		 for(String Ctab : wd.getWindowHandles()) {
	        	wd.switchTo().window(Ctab);
	        }
		
	}
	
	public void  maximizeWindow() {
	wd.manage().window().maximize();
	}
	
	public void enterTextInto(By locator, String textToEnter) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		element.sendKeys(textToEnter);
		element.submit();
	}

	public void clearText(By locator) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
	}

	public void clickOn(By locator) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}


	
	public String captureTextBefore(By locator) {
		  WebElement element = wd.findElement(locator);
          String text = element.getText();
          System.out.println("Price before addition: " + text);
          return element.getText();
	}
	
	public String captureTextAfter(By locator) {
		  WebElement element = wd.findElement(locator);
        String AfterAdd = element.getText();
        System.out.println("Price After addition: " + AfterAdd);
        return element.getText();
	}
	
    public void increaseValue(By locator, String number) {
    	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		element.sendKeys(number);
    }



	public void closeSession() {
		wd.quit();
	}

}
