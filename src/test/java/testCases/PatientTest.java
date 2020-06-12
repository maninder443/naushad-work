package testCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basePackage.TestBase;
import pageObjects.EducationPage;
import pageObjects.LoginPage;
import pageObjects.PatientPage;

public class PatientTest extends TestBase
{

	LoginPage loginPageObj;
	PatientPage patientHomePageObjs;
    EducationPage eduHomePageObj;
	
	 public PatientTest() {           
		  super(); 
		  }
		 
	 @BeforeSuite
	 public void setUP() throws InterruptedException {
		initialization();
		loginPageObj = new LoginPage();
		patientHomePageObjs =loginPageObj.loginWithPatient(prop.getProperty("usernamePatient"), prop.getProperty("password"));
		eduHomePageObj = new EducationPage();
	 }
	 
	
	/*
	 * @Test(priority = 1) public void loginPageTitleTest() {
	 * 
	 * }
	 */
	 
	 
	
	  @Test( description = "To Test Whether Patient Can Watch Eduction Vider")
	  public void PatientLoginEduVideo() throws InterruptedException {
		  patientHomePageObjs.clickOnEducation();
	      eduHomePageObj.clickOnVideo();
	      }
	 
	 
	/*
	 * @Test(priority = 1, groups = {"Sanity", "Smoke", "Regression"}, enabled =
	 * true, description = "Verify cursor goes to Education menu and click on it")
	 * public void ClickOnEducationMenu() { patientHomePageObjs.clickOnEducation();
	 * 
	 * }
	 * 
	 * @Test(priority = 2, groups = {"Sanity", "Smoke", "Regression"}, enabled =
	 * true, description = "Verify cursor goes to video & click on it") public void
	 * varifyClickOnVideo() throws InterruptedException { // Thread.sleep(5000);
	 * eduHomePageObj.clickOnVideo(); }
	 */
	 
	 
	 @AfterSuite
		public void tearDown() {
			//driver.quit();
	 }
}


