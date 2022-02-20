package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base2 {
	public static WebDriver browser;	
	
	@BeforeSuite
	public static void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");
		browser = new ChromeDriver();	
		browser.manage().window().maximize();
	}

	public static void sendKeys(String xPath, String value) {
		browser.findElement(By.xpath( xPath )).sendKeys( value );
	}
	
	public static void click(String xPath) {
		browser.findElement(By.xpath(  xPath ) ).click();
	}
	
	public static boolean isDisplayed(String xPath){
		WebElement element = browser.findElement(By.xpath( xPath ) );
		return element.isDisplayed();
	}
	
	public static boolean isEnabled(String xPath) {
		boolean b = browser.findElement(By.xpath( xPath )).isEnabled();
		return b;
	}
	
	public static void navigate(String url) {
		browser.get( url );
		}
		
	@AfterSuite
	public static void close() {
			//browser.quit();
			browser.close();
		}
	}
