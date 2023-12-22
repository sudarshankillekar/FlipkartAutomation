package com.ui.pages;

import org.openqa.selenium.By;
import com.Utils.BrowserUtility;

public class SearchPhonePage extends BrowserUtility {

    private static final By SEARCH_TEXT_BOX_LOCATOR = By.name("q");
    private static final By SELECT_FIRST_PHONE_LOCATOR = By.xpath("(//div[normalize-space()='APPLE iPhone 14 (Blue, 128 GB)'])[1]");
    private static final By PRICE_BEFORE_ADDING = By.xpath("//div[contains(text(),'₹58,999')]");
    private static final By ADD_TO_CART = By.cssSelector("._2KpZ6l._2U9uOA._3v1-ww");
    private static final By INCREASE_QUANTITY = By.xpath("//input[@value='1']");
    private static final By PRICE_AFTER_INCREASED_QUANTITY = By.cssSelector("div[class='Ob17DV _3X7Jj1'] span");

    public SearchPhonePage() {
        launchBrowser();
        goToWebSite("https://www.flipkart.com/");
        maximizeWindow();
    }

    public void searchForPhone(String phoneName) {
        enterTextInto(SEARCH_TEXT_BOX_LOCATOR, phoneName);
        clickOn(SELECT_FIRST_PHONE_LOCATOR);
    }

    public void addToCart() {
        captureTextBefore(PRICE_BEFORE_ADDING);
        ChangingTabs();
        clickOn(ADD_TO_CART);
    }

    public void increaseQuantity() {
        increaseValue(INCREASE_QUANTITY, "2");
        sleepFor(60);
        captureTextAfter(PRICE_AFTER_INCREASED_QUANTITY);
        closeSession();
    }
}
