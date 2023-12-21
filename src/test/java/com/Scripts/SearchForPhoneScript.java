package com.Scripts;

import com.ui.pages.FlipkartSearchPage;

public class SearchForPhoneScript {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		FlipkartSearchPage flipkartSearchPage =  new FlipkartSearchPage();
		flipkartSearchPage.Search_for_Phone("APPLE iPhone 14 (Blue, 128 GB");
	    flipkartSearchPage.Add_To_Cart();
	    flipkartSearchPage.Increase_Qauntity();
	    
	    
	}

}
