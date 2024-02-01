package AppiumTest.AppiumTesting;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Login extends BaseTest {
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void Test() throws MalformedURLException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//android.widget.Button)[2]")).click();
		driver.findElement(By.id("com.timesprime.timesprimeandroid:id/tv_submit")).click();
		//driver.findElement(By.xpath("(//android.widget.TextView)[3]")).click();
		driver.findElement(By.id("com.timesprime.timesprimeandroid:id/img_profile")).click();
		driver.findElement(By.id("com.timesprime.timesprimeandroid:id/benefits \n")).click();//Explore
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		//driver.findElement(By.xpath("(//android.widget.ImageView\n)[4]")).click();(login button click)		
      //android.widget.TextView[@resource-id="com.timesprime.timesprimeandroid:id/tv_submit"]
		//driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button\n")).clear();
		/*driver.findElement(AppiumBy.accessibilityId("Preference")).click();
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
	}	
	//android.widget.Button[@resource-id="com.android.permissioncontroller:id/permission_allow_button"]*/

	}
}
