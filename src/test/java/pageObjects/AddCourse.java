package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCourse extends BasePage {

	
	public AddCourse(WebDriver driver) {
        super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='Course Management']")
	WebElement ClickCourseMng;

	@FindBy(xpath = "//span[normalize-space()='Courses']")
	WebElement ClickCourses;

	@FindBy(xpath = "//a[normalize-space()='Add Course']")
	WebElement AddCOurse;

	@FindBy(xpath = "//input[@placeholder='Enter Course Name*']")
	WebElement CourseName;

	@FindBy(xpath = "//span[normalize-space()='No Course Goal Selected']")
	WebElement CourseGoal;

	@FindBy(xpath = "//span[normalize-space()='UPSC CSE']")
	WebElement selcoursegoal;

//	@FindBy(xpath = "//select[@class='form-select']")
//	WebElement clickYear;
	

//	@FindBy(xpath = "")
//	WebElement SelectPublish;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submit;
	
	public void clickcoursemanagement() {
		ClickCourseMng.click();
	}

	public void clickcoursestab() {
		ClickCourses.click();
	}

	public void addcoursebutton() {
		AddCOurse.click();
	}

	public void clickcoursename(String cname) {
		CourseName.sendKeys(cname);
	}

	public void clickcoursegoal() {
		CourseGoal.click();
	}

	public void selectcoursegoal() {
		selcoursegoal.click();
	}
	
	public void selectYear() {
	    // Locate the dropdown element
	    WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='form-select']"));  // Replace with your element's locator

	    // Create Select object using the WebElement
	    Select select = new Select(yearDropdown);

	    // Select the year 2025 from the dropdown
	    select.selectByVisibleText("2025");
	}
	
	public void Scrolltosubmit(){
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	public void clicksubmit() {
		Submit.click();
	}
	
}
