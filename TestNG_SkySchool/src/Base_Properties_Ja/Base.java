package Base_Properties_Ja;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	public static WebDriver driver;
	static FileInputStream fis;
	public static Properties myProperties;
	
	@AfterSuite
	public void tearDown() {
		driver.close();    //tab             
		//driver.quit();   //browser app close
	}
	
	@BeforeSuite
	public void setup() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		fis = new FileInputStream("C:\\Java21Jan\\workspace\\class_20_Base_Properties\\src\\properties\\locators.properties");
		myProperties = new Properties(); 
		myProperties.load(fis);
	}
	
	public void sendkeys(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}
	public void click(By by) {
		driver.findElement(by).click();
	}
	public String getText(By by) {
		return driver.findElement(by).getText();
	}
	public void navigateUrl(String url) {
		driver.get(url);
	}
	
}
