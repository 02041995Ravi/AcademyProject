package testCase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import pageObjects.LoginPage;

public class BaseClass {

	public WebDriver driver;
	
	
	
	public String randomString()
	{
		String generatedstring= RandomStringUtils.randomAlphabetic(10);
		return generatedstring;
	}
	public String randomNumber() 
	{
		String generatednum= RandomStringUtils.randomNumeric(10);
		return generatednum;
	}
	
	public String randomalphanumeric()
	{
		String generatedalphanum= RandomStringUtils.randomAlphanumeric(8);
		return generatedalphanum;
	}
	public WebDriver getDriver() {
        return driver;
    }
	
//	@AfterClass
//	public void teardown() {
//		driver.quit();
//	}
	
}
