package com.ui.pages;

import org.openqa.selenium.By;

import com.Utils.BrowserUtility;

public class FlipkartSearchPage  extends BrowserUtility{

	private static final By SearchTextBoxLocator = By.name("q");
	private static final By SelectFirstPhoneLocator = By.xpath("(//div[normalize-space()='APPLE iPhone 14 (Blue, 128 GB)'])[1]");
	private static final By PriceBeforeAdding = By.xpath("//div[contains(text(),'₹58,999')]");
	private static final By AddToCart = By.cssSelector("._2KpZ6l._2U9uOA._3v1-ww");
	private static final By IncreasQantity = By.xpath("//input[@value='1']");
	private static final By PriceAfterIncreasedQauntity =  By.cssSelector("div[class='Ob17DV _3X7Jj1'] span");  
    
	public FlipkartSearchPage() {
		// TODO Auto-generated constructor stub
		launchBrowser();
		goToWebSite("https://www.flipkart.com/");
		MaximizeWindow();
	}
 
	public void Search_for_Phone(String PhoneName) {
		enterTextInto(SearchTextBoxLocator, PhoneName);
		clickOn(SelectFirstPhoneLocator);						
	}
	
	public void Add_To_Cart() {
		CaptureTextBefore(PriceBeforeAdding);
		ChangingTabs();
		clickOn(AddToCart);
	}
	
	public void Increase_Qauntity() {
		IncreaseValue(IncreasQantity, "2");
	    sleepFor(60);
		CaptureTextAfter(PriceAfterIncreasedQauntity);
		closeSession();
	}
}
