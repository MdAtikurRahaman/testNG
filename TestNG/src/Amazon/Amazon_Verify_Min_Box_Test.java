package Amazon;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base;

public class Amazon_Verify_Min_Box_Test extends Base{

	//public static void main(String[] args) {
	@Test
	void test_Amazon_Verify_Min_Box_Is_Visible() {
		System.out.println("@Test");
		//setup();            
		
		//Navigate Amazon.com
		
		navigate("https://amazon.com");
		
		//Write Camera in Search Box 
		sendKeys("//input[@id='twotabsearchtextbox']", "camera");
		
		//Click Search Button
		click("//input[@id='nav-search-submit-button']");
		
		//Verify Min Box appears
		boolean minPriceIsDisplayed = isDisplayed("//input[@id='low-price']");
		
//		if (minPriceIsDisplayed==true)
//			System.out.println("Min Box is displayed");
//		else
//			System.out.println("Min Box is NOT displayed");
		
		Assert.assertEquals(minPriceIsDisplayed, true);
		//                   Actual           ,  Expected
		
	}//test_Amazon_Verify_Min_Box

}//class
