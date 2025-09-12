package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddPackage extends BasePage{
	
	public AddPackage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Packages']")
	WebElement clickpackages;
	
	@FindBy(xpath="//a[normalize-space()='Add Package']")
	WebElement clickaddpackage;
	
	@FindBy(xpath="//input[@placeholder='Enter Package/Product Name']")
	WebElement packagename;
	
	@FindBy(xpath="//input[@placeholder='Enter No. of lessons']")
	WebElement lessoncount;
	
	@FindBy(xpath="//input[@placeholder='Enter Duration']")
	WebElement duration;
	
	@FindBy(xpath="//div[@class='form-group mt-3 me-3']//input[@type='date']")
	WebElement startdate;
	
	@FindBy(xpath="//div[@class='form-group mt-3']//input[@type='date']")
	WebElement enddate;
	
	@FindBy(xpath="//span[normalize-space()='No Course Language Selected']")
	WebElement language;
	
	@FindBy(xpath="//span[normalize-space()='English']")
	WebElement selectlanguage;
	
	@FindBy(xpath="//span[normalize-space()='No Course Instructor Selected']")
	WebElement instructor;
	
	@FindBy(xpath="//span[normalize-space()='Dipin Damodaran']")
	WebElement selectinstructor;

	@FindBy(xpath="//input[@placeholder='Enter Module']")
	WebElement module;
	
	@FindBy(xpath="//input[@placeholder='Enter Brochure']")
	WebElement brochure;
	
	@FindBy(xpath="(//input[@placeholder='Enter Title'])[1]")
	WebElement demotitle;
	
	@FindBy(xpath="(//input[@placeholder='Enter URL'])[1]")
	WebElement demoURL;
	
	@FindBy(xpath="(//input[@placeholder='Enter Title'])[2]")
	WebElement sampletitle;
	
	@FindBy(xpath="(//input[@placeholder='Enter URL'])[2]")
	WebElement sampleURL;
	
	@FindBy(xpath="//input[@id='unpublished']")
	WebElement status;
	
	@FindBy(xpath="//input[@placeholder='Enter Product Code']")
	WebElement productcode;
	
	@FindBy(xpath="//input[@placeholder='Enter SKU']")
	WebElement sku;
	
	@FindBy(xpath="//input[@placeholder='Enter HSC/SAC Code']")
	WebElement hscsac;
	
	@FindBy(xpath="//input[@placeholder='Enter Package Price']")
	WebElement packageprice;
	
	@FindBy(xpath="//input[@placeholder='Enter Value']")
	WebElement discountvalue;
	
	@FindBy(xpath="//input[@placeholder='Discounted Price Is']")
	WebElement discountprice;
	
	@FindBy(xpath="//input[@placeholder='Enter Course Tag']")
	WebElement coursetag;
	
	@FindBy(xpath="//div[@aria-label='rdw-editor']")
	WebElement timetable;
	
	@FindBy(xpath="//input[@placeholder='Enter Code']")
	WebElement productcodevariant;
	
	@FindBy(xpath="(//input[@placeholder='Enter Module'])[2]")
	WebElement productname;
	
	@FindBy(xpath="//input[@placeholder='Enter Price']")
	WebElement variantprice;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement clicksubmit;
	
	public void clickpackagesmethod() {
		clickpackages.click();
	}
	public void clickaddpackagesmethod() {
		clickaddpackage.click();
	}
	
	public void packagenamemethod(String pname) {
		packagename.sendKeys(pname);
	}
	
	public void enterlessoncount() {
		lessoncount.sendKeys("100");;
	}
	public void enterduration() {
		duration.sendKeys("30");
	}
	
	public void packagestartdate() {
		startdate.sendKeys("20102024");
	}
	
	public void packageenddate() {
		enddate.sendKeys("20102025");
	}
	
	
	public void selectmode(){
	WebElement mode=driver.findElement(By.xpath("//select[@class='form-select']"));
	Select select=new Select(mode);
	select.selectByVisibleText("Online");
	}
	
	public void clicklanguagemethod() {
		language.click();
	}
	
	public void selectlanguagemethod() {
		selectlanguage.click();
	}
	
	public void clickinstructormethod() {
		instructor.click();
	}
	
	public void selectinstructormethod() {
		selectinstructor.click();
	}
	
	public void selectcoursemethod() {
		WebElement coursedropdown=driver.findElement(By.xpath("//div[@class='col-md-3']//select[@class='form-select form-control']"));
		Select select=new Select(coursedropdown);
		select.selectByVisibleText("2 July");
	}
	
	
	public void selectteachermethod() {
		WebElement mode1=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/form[1]/div[1]/div[11]/div[1]/select[1]"));
		Select select=new Select(mode1);
		select.selectByVisibleText("Dipin Damodaran");
	}
	
	public void selectyear() {
		WebElement mode2=driver.findElement(By.xpath("//div[@class='col-md-2']//select[@class='form-select']"));
		Select select=new Select(mode2);
		select.selectByVisibleText("2025");
	}
	
	public void brochuremethod() {
		brochure.sendKeys("https://devacademy.forumias.com/myCourses");
	}
	
	public void statusmethod() {
		status.click();
	}
	
	public void selectlocation() {
		WebElement location=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select select=new Select(location);
		select.selectByVisibleText("Online classes");
	}
	
	public void productcode(String pcode) {
		productcode.sendKeys(pcode);
	}
	
	public void Scrolltomidpage(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);",coursetag );
	}
	
	public void skumethod() {
		sku.sendKeys("ABCD");
	}
	
	public void hscmethod() {
		hscsac.sendKeys("BVDF");
	}
	
	public void packagepricemethod() {
		packageprice.sendKeys("10000");
	}
	
	public void discounttypemethod() {
		WebElement mode3=driver.findElement(By.xpath("//div[@class='form-group mt-3 w-50']//select[@class='form-select']"));
		Select select=new Select(mode3);
		select.selectByVisibleText("Flat Discount");
	}
	
	public void gsttypemethod() {
		WebElement mode4=driver.findElement(By.xpath("//div[@class='col-md-2']//select[@class='form-select form-control']"));
		Select select=new Select(mode4);
		select.selectByVisibleText("CGST");
	}

	
	public void coursetagmethod() {
		coursetag.sendKeys("2024");
	}
	
	public void submitform() {
		clicksubmit.click();
	}
	public void Scrolltosubmit1(){
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	
}