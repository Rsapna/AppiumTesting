package AppiumTest.AppiumTesting;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Scroll extends BaseTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void Test() throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
	}

}
