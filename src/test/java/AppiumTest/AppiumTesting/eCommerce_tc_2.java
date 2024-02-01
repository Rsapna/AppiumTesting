package AppiumTest.AppiumTesting;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_2 extends BaseTest{
	
  @Test 
	public void FillForm() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rahul Rana");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
	//	driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))"));
	  //  driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	   // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))"));
	    driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();
	    driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.widget.TextView[@text='Cart']"))));
	    wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
        List<WebElement> productPrice=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
	    float actualPrice=0;
        for(int i=0;i<productPrice.size();i++)
	    {
        	
        	actualPrice=actualPrice+Float.parseFloat(productPrice.get(i).getText().split("\\$")[1].trim());
	    	
	    }
      
	    float expectedPrice=Float.parseFloat(driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText().split("\\$")[1].trim());
        Assert.assertEquals(actualPrice, expectedPrice);	
        WebElement element=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
        driver.executeScript("mobile:longClickGesture", ImmutableMap.of("element",element,"duration",2000));
	    driver.findElement(By.id("android:id/button1")).click();
	    driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	    Thread.sleep(3000);
	    Set<String> contexts=driver.getContextHandles();
	    for(String ContextNames:contexts)
	    	System.out.println(ContextNames);
	    
	    driver.context("WEBVIEW_com.androidsample.generalstore");
	  //driver.findElement(By.xpath("//div[@role='combobox']")).click();
	    driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Test");
	    driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
	    //driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	}

}













