package Others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selanium_Practice2 {

	@Test
	public void calculateloanEMI() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\driver\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://emicalculator.net/");
		
		Actions actions = new Actions(driver);
		
		WebElement loanSliderCircle = driver.findElement(By.cssSelector("#loanamountslider >span"));
		WebElement interestSliderCircle = driver.findElement(By.cssSelector("#loaninterestslider >span"));
		WebElement tenureSliderCircle = driver.findElement(By.cssSelector("#loantermslider >span"));
		
		actions.dragAndDropBy(loanSliderCircle, 83, 0).build().perform();
		Thread.sleep(3000);
		
		actions.dragAndDropBy(interestSliderCircle, 88, 0).build().perform();
		Thread.sleep(2000);
		
		actions.dragAndDropBy(tenureSliderCircle, -111, 0).build().perform();
		Thread.sleep(1000);
		
		WebElement loanEMIElement = driver.findElement(By.cssSelector("#emiamount > p >span"));
		String loanEMIText = loanEMIElement.getText();
		// 10000.50
		Assert.assertEquals("92,439", loanEMIText);
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
