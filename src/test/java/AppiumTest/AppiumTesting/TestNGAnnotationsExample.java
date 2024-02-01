package AppiumTest.AppiumTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsExample  {

	@BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite: Executing before the Test Suite...");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test: Executing before each Test tag in the XML file...");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class: Executing before the test class starts...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method: Executing before each test method...");
    }

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1: Executing Test Case 1...");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2: Executing Test Case 2...");
    }
    @Test
    public void testMethod3() {
        System.out.println("Test Method 3: Executing Test Case 3...");
    }
     
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method: Executing after each test method...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class: Executing after the test class ends...");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test: Executing after each Test tag in the XML file...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite: Executing after the Test Suite completes...");
    }
	
}
