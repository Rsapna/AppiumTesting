package AppiumTest.AppiumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.loginpage;
import Pages.loginpagefacory;
import io.appium.java_client.AppiumBy;import io.appium.java_client.functions.ExpectedCondition;

public class eCommerce_tc_1 extends BaseTest {
	
	@Test
	public void FillForm()
	{
		//loginpage page= new loginpage(driver);
      //page.setUserName("Ragini");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //loginpage page= new loginpage(driver);
	      //page.setUserName("Ragini");
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rahul Rana");
		loginpagefacory fac=new loginpagefacory(driver);
		fac.setUserName("Ragini1");
		driver.hideKeyboard();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.RadioButton[@text='Female']")));
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))"));
	    driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	   
	}
	
	}
