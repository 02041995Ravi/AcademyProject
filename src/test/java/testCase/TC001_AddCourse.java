package testCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AddCourse;
import pageObjects.AddLesson;
import pageObjects.AddPackage;
import pageObjects.AddUnit;
import pageObjects.LoginPage;


public class TC001_AddCourse extends BaseClass {

	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
	    driver = new ChromeDriver();   // ✅ Assign to class-level driver
	    driver.manage().deleteAllCookies();
	    driver.get("https://devbackend.forumias.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
	    Thread.sleep(2000);

	    LoginPage lp = new LoginPage(driver);
	    Thread.sleep(2000);
	    lp.setusername();
	    lp.setpswd();
	    lp.clicksubmit();
	    Thread.sleep(5000);
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	}

	@Test (priority= 1)
	public void VerifyAddCOurse() throws InterruptedException {
		AddCourse ac = new AddCourse(driver);
		ac.clickcoursemanagement();
		ac.clickcoursestab();
		ac.addcoursebutton();
		ac.clickcoursename(randomString());
		ac.clickcoursegoal();
		ac.selectcoursegoal();
		ac.selectYear();
		ac.Scrolltosubmit();
		ac.clicksubmit();
		Thread.sleep(5000);
	}


	@Test(priority= 2)
	public void VerifyAddPckage() throws InterruptedException {
		AddPackage ap = new AddPackage(driver);
		ap.clickpackagesmethod();
		ap.clickaddpackagesmethod();
		ap.packagenamemethod(randomString());
		ap.enterlessoncount();
		ap.enterduration();
		ap.packagestartdate();
		ap.packageenddate();
		ap.selectmode();
		ap.clicklanguagemethod();
		ap.selectlanguagemethod();
		ap.clickinstructormethod();
		ap.selectinstructormethod();
		ap.selectcoursemethod();
		ap.selectteachermethod();
		ap.selectyear();
		ap.brochuremethod();
		ap.statusmethod();
		ap.Scrolltomidpage();
		ap.skumethod();
		ap.hscmethod();
		ap.packagepricemethod();
		ap.discounttypemethod();
		ap.gsttypemethod();
		ap.coursetagmethod();
		ap.submitform();
		Thread.sleep(2000);
		ap.selectlocation();
		ap.productcode(randomString());
		ap.Scrolltosubmit1();
		ap.submitform();
		Thread.sleep(5000);
	}

	@Test(priority= 3)
	public void VerifyAddUnit() throws InterruptedException {
		AddUnit au = new AddUnit(driver);
		au.clickunit();
		au.clickaddunit();
		Thread.sleep(2000);
		au.addunitname(randomString());
		au.shortdescription();
		au.clicksubmit();
		Thread.sleep(4000);
	}
	
	@Test(priority= 4)
	public void VerifyAddLesson() {
		AddLesson ad= new AddLesson(driver);
		//ad.clickcoursemanagement();
		ad.ClickLessons();
		ad.AddLessonButton();
		ad.AddLessonName(randomString());
		ad.ClickLessonTypeDropdown();
		ad.SelectLessonType();
		ad.Scrolltosubmit1();
		//ad.SelectPreReading();
		ad.submitform();
		
		
		
	}
}


/*
 * // { // //switch (br){ //case "chrome": driver = new ChromeDriver(); break;
 * // case "edge": driver = new EdgeDriver(); break; //case "firefox": driver =
 * new FirefoxDriver();break; // default: System.out.println("Invalid Browser");
 * return; } }
 */

