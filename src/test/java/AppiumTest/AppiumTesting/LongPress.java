package AppiumTest.AppiumTesting;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest {

	@SuppressWarnings("deprecation")
	@Test
	public void Test() throws MalformedURLException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		//driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
        //WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        //driver.executeScript("mobile:longClickGesture", ImmutableMap.of("element",ele,"duration",2000));
       //name:Ragini
        WebElement ele2=driver.findElement(By.xpath("//android.widget.TextView[@text='Dog Names']"));
        driver.executeScript("mobile:longClickGesture", ImmutableMap.of("element",ele2,"duration",2000));
      //android.widget.TextView[@text="Dog Names"]
		
	}
}
