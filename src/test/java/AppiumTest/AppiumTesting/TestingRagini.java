package AppiumTest.AppiumTesting;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class TestingRagini extends BaseTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void Test() throws MalformedURLException, InterruptedException
	{
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='android:id/edit']")).sendKeys("Ragini");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();

            
        	
	
	}
}
