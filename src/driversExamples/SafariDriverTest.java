package driversExamples;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverTest
{
	WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		driver = new SafariDriver();
	}

	@Test
	public void testSafariDriver()
	{
		driver.get("http://baidu.com");
		driver.getTitle();
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
