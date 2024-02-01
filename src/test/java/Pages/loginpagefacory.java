package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagefacory {
	
	WebDriver driver;
	
	public loginpagefacory(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
	
	@FindBy(id="com.androidsample.generalstore:id/nameField")
	WebElement userName;
	public void setUserName(String strUserName){

		userName.sendKeys(strUserName);

    }



}
