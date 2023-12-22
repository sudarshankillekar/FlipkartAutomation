package com.Scripts;

import com.ui.pages.SearchPhonePage;

public class SearchForPhoneScript {


	public static void main(String[] args) {     
		SearchPhonePage searchPhonePage = new SearchPhonePage();
		searchPhonePage.searchForPhone("APPLE iPhone 14 (Blue, 128 GB");
		searchPhonePage.addToCart();
		searchPhonePage.increaseQuantity();
		
	}

}
