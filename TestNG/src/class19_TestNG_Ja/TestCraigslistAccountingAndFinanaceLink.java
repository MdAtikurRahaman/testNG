package class19_TestNG_Ja;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCraigslistAccountingAndFinanaceLink {

	public static void main(String[] args) {
		
		WebDriver site; 
		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");
		site = new ChromeDriver();  
		site.manage().window().maximize();
		site.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	

		site.get("http://craigslist.org");
		
		site.findElement(By.xpath("//span[text()='accounting+finance']")).click();
		
		Boolean result = site.findElement(By.linkText("accounting/finance")).isDisplayed();
		
		if (result == true) {
			System.out.println("accounting/finance link is working fine");
		}
		if (result == false) {
			System.out.println("accounting/finance link is NOT working");
		}


	}

}
