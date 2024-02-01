package AppiumTest.AppiumTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class FirstProgram extends BaseTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void Test() throws MalformedURLException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("(//android.widget.TextView)[4]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.TextView)[4]")).click();
		Thread.sleep(2000);
		String actualResult=driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(actualResult, "WiFi settings");
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='android:id/edit']")).sendKeys("Ragini");
		//driver.findElement(By.xpath("(//android.widget.LinearLayout)[6]")).click();
        driver.findElement(By.id("android:id/button1")).click();
//		driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='android:id/title_template']")).click();
		//driver.navigate().back();
	    //driver.findElement(AppiumBy.accessibilityId("Text")).click();
		//driver.navigate().back();
	    //driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//driver.navigate().back();

	}

}

