package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddLesson extends BasePage {
		
		public AddLesson(WebDriver driver) {
			super(driver);
		}
		@FindBy(xpath = "//span[normalize-space()='Course Management']")
		WebElement ClickCourseMng;
		
		@FindBy(xpath="//span[normalize-space()='Lessons']")
		WebElement ClickLessons;
		
		@FindBy(xpath="//a[@href='/admin/courseManagement/lessonList/addLesson']")
		WebElement ClickAddLesson;
		
		@FindBy(xpath="//input[@placeholder='Enter Lesson Name*']")
		WebElement LessonName;
		
		@FindBy(xpath="//select[@name='lesson_type']")
		WebElement ClickLessonType;
		
		@FindBy(xpath="//div[normalize-space()='Select Pre Reading']")
		WebElement SelectPreReading;
		
		@FindBy(xpath="//button[normalize-space()='Submit']")
		WebElement ClickSubmit;
		
		public void clickcoursemanagement() {
			ClickCourseMng.click();
		}
		
		public void ClickLessons() {
			ClickLessons.click();
		}
		public void AddLessonButton() {
			ClickAddLesson.click();
		}
		
		public void AddLessonName(String lname) {
			LessonName.sendKeys(lname);
		}
		
		public void ClickLessonTypeDropdown() {
			ClickLessonType.click();
		}
		
		public void SelectLessonType() {
			WebElement Type= driver.findElement(By.xpath("//select[@id='lesson_type']"));
			Select sc = new Select(Type);
			sc.selectByVisibleText("Video");
		}
		
		public void SelectPreReading() {
			WebElement Prereading= driver.findElement(By.xpath("//div[normalize-space()='Select Pre Reading']"));
			Select sc = new Select (Prereading);
			sc.selectByVisibleText("test--345");
		}
			
			public void submitform() {
				ClickSubmit.click();
			}
			
			public void Scrolltosubmit1(){
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			}
					
		}



