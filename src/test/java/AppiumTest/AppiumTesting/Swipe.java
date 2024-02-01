package AppiumTest.AppiumTesting;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Swipe extends BaseTest {

	@SuppressWarnings("deprecation")
	@Test
	public void Test() throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	    driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	    WebElement FirstImage=driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
	    driver.executeScript("mobile:swipeGesture", ImmutableMap.of("element",FirstImage,"direction","left","percent",0.75));

	}
}
