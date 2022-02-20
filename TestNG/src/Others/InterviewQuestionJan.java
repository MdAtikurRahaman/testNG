package Others;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestionJan {

	public static void main(String[] args) {
		
		//Q: Can you tell first few lines of you selenium testing code
		//Ans: all the lines below till site.get
		
		WebDriver site; 
		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");
		site = new ChromeDriver();  
		site.manage().window().maximize();
		site.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	

		site.get("http://walmart.com");
		
		//site.findElement(By.id("global-search-input")).sendKeys("camera");
		
		WebElement e = site.findElement(By.id("global-search-input"));
		e.sendKeys("camera");
		
		//Q: What is the difference between findElement and findElementS?
		//Ans: When we need to locate any single WebElement then use FindElement
		//	When we need to locate multiple WebElement then use FindElements
		//  FindElementS returns a List of WebElements  List<WebElement>
		site.findElement(By.id("global-search-submit")).click();  
		
		Alert alert = site.switchTo().alert();    
	    alert.dismiss();
		
		List<WebElement> elements = site.findElements(By.xpath("//ul[@data-automation-id='search-result-gridview-items']/li"));
		
		System.out.println("Total length of Elements is " + elements.size());
		
		//WebElement e = <tag>someting</tag>
		//String s = something
		
		for (WebElement element:elements   ) {
			//site.findElement  X                          here dot means current Web Element    
			String cameraName = element.findElement(By.xpath(".//a[@class='product-title-link line-clamp line-clamp-2 truncate-title']/span")).getText();
			System.out.println(cameraName);
			
			String price = element.findElement(By.xpath(".//span[@class='price display-inline-block arrange-fit price price-main']/span[@class='visuallyhidden']")).getText();
			System.out.println(price);
			
		}
		
		//HW: do same on 10 sites.
	
		
		
		
	//	Extra Questions:
		
	//	1. Smoke Testing?
//		2. Sanity Testing?
//			Ans: Sanity testing is a kind of Software Testing performed after receiving a software build, 
//			with minor changes in code, or functionality, to ascertain that the bugs have been fixed and 
//			no further issues are introduced due to these changes. 
//		2. Regression Testing?
	//	3. Thoro Testing?
	//	4. Retesting?
		
//		Jahed bhai Explanation:
//		Regretion - password (8) add ar karona problem.
//		Retest - purata test kora
//		Smoke - Button click (thik asa) over all
//		Saniti---ase - Medical (Helth check(eye problem  asa)) pora glass diba.
		
		
//		Q #20) When do we perform Smoke testing?
//
//		Answer: Smoke testing is performed on the application after receiving the build. 
//		Tester usually tests for the critical path and not the functionality in deep to make sure, 
//		whether the build is to be accepted for further testing or to be rejected in case of broken application.
//
//		A smoke checklist usually contains the critical path of the application without which 
//		an application is blocked.
//
//		Q #21) What do you understand by Sanity testing?
//
//		Answer: Sanity testing is performed after receiving the build to check the new functionality/defects 
//		to be fixed. In this form of testing the goal is to check the functionality roughly as expected and 
//		determine whether the bug is fixed and also the effect of the fixed bug on the application under test.
//
//		There is no point in accepting the build by the tester and wasting time if Sanity testing fails.
//		
		
//		Q Regression testing?	
//		Answer:Regression testing is the form of testing which is carried out to make sure that implementation of 
//		any new feature or fixes does not affect any other part or functionality of the application.
//		
//		Q Retesting?
//		Answer:Retesting is the form of testing the application after fixing of defects for those test cases 
//		which were failed in last execution.
	}//main

}
