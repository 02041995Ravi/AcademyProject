package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUnit extends BasePage{

	public AddUnit(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Units']")
	WebElement clickUnit;
	
	@FindBy(xpath = "//a[normalize-space()='Add Unit']")
	WebElement AddUnit;
	
	@FindBy(xpath = "//input[@placeholder='Enter First Name*']")
	WebElement Unitname;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submitbutton;
	
	@FindBy(xpath="//div[@aria-label='rdw-editor']")
	WebElement ShortDesc;

	public void clickunit() {
		clickUnit.click();
	}
	
	public void clickaddunit() {
		AddUnit.click();
	}
	
	public void addunitname(String uname) {
		Unitname.sendKeys(uname);
	}
	
	public void clicksubmit() {
		Submitbutton.click();
	}
	public void shortdescription() {
		ShortDesc.sendKeys("This is for testing purpose only");
	}
	
	
	
	
}
