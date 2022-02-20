package Others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCraigslistAptAndHousingLinkJan {

	public static void main(String[] args) {
		
		WebDriver site; 
		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");
		site = new ChromeDriver();  
		site.manage().window().maximize();
		site.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	

		site.get("http://craigslist.org");
		
		site.findElement(By.xpath("//span[text()='apts / housing']")).click();
		
		Boolean result = site.findElement(By.linkText("apartments / housing for rent")).isDisplayed();
		
		if (result == true) {
			System.out.println("apts / housing' link is working fine");
		}
		if (result == false) {
			System.out.println("apts / housing' link is NOT working");
		}
		
		

	}

}
