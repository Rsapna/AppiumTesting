package AppiumTest.AppiumTesting;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Browser extends BaseTest{
	@Test
	public void Test() throws MalformedURLException, InterruptedException
	{		
		driver.get("https://www.google.com/");
	    driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Test");
	    driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);

	
	}

}
