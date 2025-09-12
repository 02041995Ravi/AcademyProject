package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='phone']")
	private WebElement LoginUsername;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement LoginPswd;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement Submit;

	public void setusername() {
		LoginUsername.sendKeys("9650988203");
	}

	public void setpswd() {
		LoginPswd.sendKeys("7499242065");
	}

	public void clicksubmit() {
		Submit.click();
	}
}
