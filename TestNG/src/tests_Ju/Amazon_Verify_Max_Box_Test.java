package tests_Ju;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base;

public class Amazon_Verify_Max_Box_Test extends Base{
	//public static void main(String[] args) {
	
	@Test
	void test_Amazon_Verify_Max_Box_Is_Visible() {	
//		WebDriver browser;  //WebDriver is an INTERFACE
//		
//		System.setProperty("webdriver.chrome.driver","C:\\java\\driver\\chromedriver.exe");
//		
//		browser = new ChromeDriver(); //here browser object variable is instantiating using ChromeDriver() constructor 
//		Base b;       
//		b.setup();
//      b.browser.findElement()		
		
		//setup();
		
		//Navigate Amazon.com
		//browser.get("https://amazon.com");
		navigate("https://amazon.com");
		
		//Write Camera in Search Box 
		//browser.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("camera");
		sendKeys("//input[@id='twotabsearchtextbox']", "camera");
		
		//Click Search Button
		//browser.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		click("//input[@id='nav-search-submit-button']");
		
		//Verify Max Box appears
		//boolean maxPriceIsDisplayed = browser.findElement(By.xpath("//input[@id='high-price']")).isDisplayed();
		boolean maxPriceIsDisplayed = isDisplayed("//input[@id='high-price']");
//		if (maxPriceIsDisplayed==true)
//			System.out.println("Max Box is displayed");
//		else
//			System.out.println("Max Box is NOT displayed");
		Assert.assertEquals(maxPriceIsDisplayed, true);
		//close();
		
	}//test_Amazon_Verify_Max_Box_Is_Visible

}