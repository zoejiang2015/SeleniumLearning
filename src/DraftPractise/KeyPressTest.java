package DraftPractise;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;


//
public class KeyPressTest
{
	static WebDriver driver;

	@BeforeClass
	public static void setUp()
	{
		driver = new FirefoxDriver();
		String url = "http://wwwqa.shop.ford.com/build/escape/2015/?&branding=1&lang=en&makeTransition=config&gnav=header-tools#/chooseyourpath/";
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test
	public void testKeyPress() throws InterruptedException
	{
		elementsRepo.EnterField(driver).sendKeys("12345");
		elementsRepo.SumbitButton(driver).click();
		Thread.sleep(5000);
		elementsRepo.getBuildandPrice(driver).click();
		elementsRepo.getConfigureBtn(driver).click();
		elementsRepo.getSummary(driver).click();
		elementsRepo.getSPCLink(driver);
		elementsRepo.getprint(driver).click();
		
		Thread.sleep(10000);
	}
	
	
	@AfterClass
	public static void tearDown()
	{
		driver.quit();
	}
}



 class elementsRepo
{
	 static WebElement element;
	 static WebElement element2;
	 
	 public static WebElement getBuildandPrice(WebDriver driver)
	 {
		 try
		 {
			 element = driver.findElement(By.xpath("//div[contains(@class, 'build-your-own')]/div/div/img"));
		 }
		 catch(NoSuchElementException e)
		 {
			 System.out.println("~~~~~~ Error ~~~~~~" + "BuildandPrice Not Found");
		 }
		 return element;
	 }
	 
	 public static WebElement getConfigureBtn(WebDriver driver)
	 {
		 try
		 {
			 
			 element = driver.findElement(By.cssSelector("div.custom-cta-inner"));
		 }
		 catch(Exception e)
		 {
			 System.out.println("~~~~~~ Error ~~~~~~" + "ConfigureBtn not foud");
		 }
		
		 return element;
	 }
	 
	 public static WebElement getSummary(WebDriver driver)
	 {
		 try
		 {
			 element = driver.findElement(By.cssSelector("div.summary-btn-alt-wrapper"));
		 }
		 catch(ElementNotFoundException e)
		 {
			 System.out.println("~~~~~~ Error ~~~~~~" + "Summary not found");
		 }
		 
		 return element;
	 }
	 
	 public static WebElement getSPCLink(WebDriver driver)
	 {
		 try
		 {
			 element = driver.findElement(By.linkText("Calculate Payments"));
		 }
		 catch(ElementNotFoundException e)
		 {
			 System.out.println("~~~~~~ Error ~~~~~~" + "PCLink not found ");
		 }
		 
		 return element;
	 }
	 
	 public static WebElement getprint(WebDriver driver)
	 {
		 try
		 {
			 element = driver.findElement(By.linkText("Print Results"));
		 }
		 catch(ElementNotFoundException e)
		 {
			 System.out.println("~~~~~~ Error ~~~~~~" + "print not found ");
		 }
		 
		 return element;
	 }
	 //#postal-input
	 public static WebElement EnterField(WebDriver driver)
	 {
		 try
		 {
			 element = driver.findElement(ById.id("#postal-input"));
			 
			 
		 }
		 catch(ElementNotFoundException e)
		 {
			 System.out.println("~~~~~~ Error ~~~~~~" + "Enter Field not found ");
		 }
		 
		 return element;
	 }
	 public static WebElement SumbitButton(WebDriver driver)
	 {
		 try
		 {
			 element = driver.findElement(By.xpath("//span[contains(text(), 'Enter')]"));
			 
		 }
		 catch(ElementNotFoundException e)
		 {
			 System.out.println("~~~~~~ Error ~~~~~~" + "Submit button not found ");
		 }
		 
		 return element;
	 }
	 
}
 
class elementsList
{
	 public ArrayList<WebElement> getElementList(Driver driver)
	{
		 ArrayList<WebElement> elementList = new ArrayList<WebElement>();
		 // STH load multiple elements which section #XXX
		 
		return elementList;
	}
}