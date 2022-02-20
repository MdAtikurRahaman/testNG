package BEST_BUY;

import org.testng.annotations.Test;

import Base.Base;

import org.testng.Assert;


public class BEST_BUY_Max_Value extends Base{
	
	@Test
	void test_BEST_BUY_Max_Box_Is_Visible() {	

		navigate("https://www.bestbuy.com");

		//sendKeys("//input[@id='gh-search-input']", "Samsung TV" + Keys.ENTER);
		sendKeys("//input[@id='gh-search-input']", "Samsung TV");

		click("//button[@class='header-search-button']");

		boolean maxPriceIsDisplayed = isDisplayed("//input[@id='max-currentprice_facet-input']");

		Assert.assertEquals(maxPriceIsDisplayed, true);
	}
}
