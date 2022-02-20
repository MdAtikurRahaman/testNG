package BEST_BUY;

import org.testng.annotations.Test;
import org.testng.Assert;

import Base.Base2;

public class BEST_BUY_Min_Verify extends Base2{
	
	@Test
	void test_BEST_BUY_Min_Box_Is_Visible() {	

		navigate("https://www.bestbuy.com");

		//sendKeys("//input[@id='gh-search-input']", "Samsung TV" + Keys.ENTER);
		sendKeys("//input[@id='gh-search-input']", "Samsung TV");

		click("//button[@class='header-search-button']");

		boolean minPriceIsDisplayed = isDisplayed("//input[@id='min-currentprice_facet-input']");

		Assert.assertEquals(minPriceIsDisplayed, true);
	}
}
