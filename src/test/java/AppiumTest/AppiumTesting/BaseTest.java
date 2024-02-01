package AppiumTest.AppiumTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	AppiumDriverLocalService service;
	AndroidDriver driver;
	@BeforeClass
public void configureAppium() throws MalformedURLException {
	 service= new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
 .withIPAddress("127.0.0.1").usingPort(4723).build();
	service.start();
			UiAutomator2Options options=new UiAutomator2Options();
//options.setCapability(MobileCapabilityType.DEVICE_NAME, "RaginiEmulator");
options.setCapability(MobileCapabilityType.APP, "/Users/Ragini.Gautam/Downloads/AppiumTesting 6/src/test/java/Resources/ApiDemos-debug.apk");
//options.setCapability(MobileCapabilityType.APP, "/Users/Ragini.Gautam/Downloads/grxEventsIntegrationR.apk");
//options.setCapability(MobileCapabilityType.APP, "/Users/Ragini.Gautam/Downloads/app-assembleDynamicQaDebug23.apk");
//options.setCapability(MobileCapabilityType.APP, "/Users/Ragini.Gautam/Downloads/app-assembleProductionQaDebug(1).apk");

//options.setCapability(MobileCapabilityType.APP, "/Users/Ragini.Gautam/Downloads/General-Store.apk");
//options.setCapability(MobileCapabilityType.APP, "/Users/Ragini.Gautam/Downloads/chromedriver");
//options.setCapability("browserName", "Chrome");
//options.setCapability("chromedriverExecutable", "/Users/Ragini.Gautam/Downloads/chromedriver"); // Path to chromedriver executable


 driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
}
	@AfterClass
public void teardown() {
		//driver.quit();
	//service.stop();
}
}
