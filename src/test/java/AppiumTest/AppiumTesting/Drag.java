package AppiumTest.AppiumTesting;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Drag extends BaseTest {
	@SuppressWarnings("deprecation")
	@Test
	public void Test() throws MalformedURLException, InterruptedException
	{
		//driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		//drag(source, 836,732);
		//ImmutableMap.of("element",source,"endX",836,"endY",732));
		driver.executeScript("mobile:dragGesture", ImmutableMap.of("element",source,"endX",836,"endY",732));

		
		
	}
	

}
