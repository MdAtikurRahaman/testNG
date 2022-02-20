package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {
	public static WebDriver browser; // WebDriver is an INTERFACE
	
	@BeforeSuite   //here BeforeSuite is an Annotation of TestNG
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");
		browser = new ChromeDriver(); // here browser object variable is instantiating using ChromeDriver()
	}
	
	public static void navigate(String url) {
		browser.get(url);
	}
	
	public  static void sendKeys(String xPath, String value) {
		browser.findElement(By.xpath( xPath )).sendKeys( value );
	}
	
	public static void click(String xPath) {
		browser.findElement(By.xpath( xPath )).click();
	}
	
	public static boolean isDisplayed(String xPath) {
		boolean b = browser.findElement(By.xpath( xPath )).isDisplayed();
		return b;
	}

	public static boolean isEnabled(String xPath) {
		boolean b = browser.findElement(By.xpath( xPath )).isEnabled();
		return b;
	}
	
	@AfterSuite
	public static void close() {
		browser.quit(); //Chrome Browser(App) Close
		//browser.close(); //Tab Close	
	}
	@BeforeClass
	public static void my_before_class_Method() {
		System.out.println("@BeforeClass exexuted");
		//browser.manage().window().maximize();
	}
	
	@BeforeGroups("Smoke")
	public static void before_smoke_group() {
		System.out.println("@BeforeGroups('Smoke') Executed");
	}

	
	@BeforeMethod
	public static void beforeTestMethod() {
		System.out.println("@BeforeMethod exexuted");
		//browser.manage().window().maximize();
	}
	@AfterMethod
	public static void afterTestMethod() {
		System.out.println("@AfterMethod exexuted");
		browser.switchTo().activeElement();
	}
}


