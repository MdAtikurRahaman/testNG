package Google;

import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import Base.Base2;

public class Test_Google extends Base2{
	
	@Test
	void test_Google_Is_Visible() {	

		navigate("https://www.google.com");

		sendKeys("//input[@name='q']", "google maps" + Keys.ENTER);
		//sendKeys("//input[@name='q']", "google maps" );

		click("//h3[text()='Google Maps']");

		boolean googleMapSearchIsDisplayed = isDisplayed("//input[@id='searchboxinput']");

		Assert.assertEquals(googleMapSearchIsDisplayed, true);
	}
}
