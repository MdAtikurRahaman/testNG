package Amazon;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.Base;

public class Amazon_Verify_Go_Button_Test extends Base{
	//Q: How you can prioritized Test inside same Class?
	//Ans: We can define number as priority attribute value inside the Test Annotation
	
	//Q: What is attribute?
	//Ans: Attribute is define by KEY=value
	
	@Test(priority=1)
	void test_Amazon_Verify_Go_Button_Is_Visible() {
		System.out.println("@Test 1");
		//Navigate Amazon.com
		navigate("https://amazon.com");
		//Write Camera in Search Box 
		sendKeys("//input[@id='twotabsearchtextbox']", "camera");
		//Click Search Button
		click("//input[@id='nav-search-submit-button']");
		//Verify Max Box appears
		boolean maxPriceIsDisplayed = isDisplayed("//span[@id='a-autoid-1-announce']");
		//Assert.assertEquals(maxPriceIsDisplayed, true);
		
		//Assert.assertTrue(false);

		SoftAssert softAssertion= new SoftAssert();
		softAssertion.assertTrue(false);
		System.out.println("Assert Method Was Executed");

	}
	
	@Test(priority=2, groups={"Smoke"})
	void test_Amazon_Verify_Go_Button_Is_Enabled() {
		System.out.println("@Test 2");
		//Navigate Amazon.com
		navigate("https://amazon.com");
		//Write Camera in Search Box 
		sendKeys("//input[@id='twotabsearchtextbox']", "camera");
		//Click Search Button
		click("//input[@id='nav-search-submit-button']");
		//Verify Max Box appears
		boolean maxPriceIsDisplayed = isEnabled("//span[@id='a-autoid-1-announce']");
		Assert.assertEquals(maxPriceIsDisplayed, true);
	}//test_Amazon_Verify_Max_Box_Is_Visible
	
}
