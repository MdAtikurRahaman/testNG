package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base;

public class Practice extends Base{
	
	@Test(priority=1)
	void verify_Button_caption_name_is_Completed () {
	
	navigate("https://sit.skyschooling.com/sdet/selenium/xpath/index.html");
	
	sendKeys("//input[@id='firstName']", "Joe");
	
	sendKeys("//input[@name='LastName']", "Dovella");
	
	click("//button[@id='submit_result']");
	
	String actualButtonCaption = browser.findElement(By.xpath("//button[text()='Completed']")).getText();
	
	//boolean maxPriceIsDisplayed = isEnabled("//span[@id='a-autoid-1-announce']");
	Assert.assertEquals(actualButtonCaption, "Completed");
	}
	
	
	
	@Test(priority=2)
	void verify_Reseat_Button_caption_name_is_Cleared () {
	
	navigate("https://sit.skyschooling.com/sdet/selenium/xpath/index.html");
	
	sendKeys("//input[@id='firstName']", "Joe");
	
	sendKeys("//input[@name='LastName']", "Dovella");
	
	click("//button[@id='submit_result']");
	
	String actualButtonCaptionIs = browser.findElement(By.xpath("//button[text()='Completed']")).getText();
	
	//boolean maxPriceIsDisplayed = isEnabled("//span[@id='a-autoid-1-announce']");
	Assert.assertEquals(actualButtonCaptionIs, "Cleared");


	}
}
