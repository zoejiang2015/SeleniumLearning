package driversExamples;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeIEDriver
{
	static WebDriver driver;

	@BeforeClass
	public static void  setUp()
	{
		 System.setProperty("webdriver.chrome.driver", "C:/selenium took kit/chromedriver.exe");
		 driver = new ChromeDriver();
	}

	@Test
	public void testFindDealer() throws InterruptedException
	{
		driver.get("http://www.baidu.com");
		Thread.sleep(2000);
		WebElement element;
		element = driver.findElement(By.cssSelector("input#su"));
		
		try
		{
			assertEquals(false, element.isDisplayed());
		}
		catch(AssertionError e)
		{
			System.out.println("Testing Failed for button displayed or not");
		}
		driver.getTitle();
		System.out.println("XXXXXXXX" + driver.getTitle());
		
	}
	
	
	@AfterClass
	public static void tearDown()
	{
		driver.quit();
	}
}
