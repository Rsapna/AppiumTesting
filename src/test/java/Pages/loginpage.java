package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{

        this.driver = driver;

    }
	By userName = By.id("com.androidsample.generalstore:id/nameField");
	public void setUserName(String strUserName){

        driver.findElement(userName).sendKeys(strUserName);

    }

}

