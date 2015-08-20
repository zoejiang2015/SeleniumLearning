package driversExamples;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//firefox driver

public class RedesignFordDealer
{
	WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://wwwqa.ford.com/dealerships/locate?gnav=header-finddealer");
		driver.manage().window().maximize();
	}

	@Test
	public void testFindDealer()
	{
		driver.findElement(By.linkText("Close")).click();
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
