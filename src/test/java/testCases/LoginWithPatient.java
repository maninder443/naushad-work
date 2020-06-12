package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.TestBase;
import pageObjects.EducationPage;
import pageObjects.EntertainmentPage;
import pageObjects.LoginPage;
import pageObjects.PatientPage;
import pageObjects.VideoPage;

public class LoginWithPatient extends TestBase {

	LoginPage loginPage;
	PatientPage patientPage;
	EducationPage educationPage;
	EntertainmentPage entertainmentPage;
	VideoPage videoPage;
	
	  public LoginWithPatient() { 
	  super(); 
	  }
	
	@BeforeMethod
	public void setUP() {
		initialization();
		loginPage = new LoginPage();
		patientPage= new PatientPage();
		educationPage=new EducationPage();
		entertainmentPage= new EntertainmentPage();
		videoPage=new VideoPage();
	}

	@Test(priority = 2,
			enabled = true,
			description = "Validate patient user is able to logged in successfull into DaVita application by valid credential")
	public void validLogin() {
		loginPage.loginWithPatient(prop.getProperty("usernamePatient"), prop.getProperty("password"));
		loginPage.clickOnLogin();
    	String actual = patientPage.patientDashboardText();
		String expected = "Today's Tasks";	
		Assert.assertEquals(actual, expected);
	}
	

	@Test(priority = 1,
			enabled = true,
			description = "Validate patient user is not able to logged into DaVita application by invalid credential")
	public void invalidLogin() {
		loginPage.validateLoginPageTitle();
		loginPage.validatedavitaLogo();
		loginPage.loginWithPatient(prop.getProperty("usernamePatient"), prop.getProperty(""));
		loginPage.clickOnLogin();
		String actual = loginPage.loginPageText();
		String expected = "Sign in to your Account";
		Assert.assertEquals(actual, expected);
		
	}
	
	
	  @Test(priority = 3,
			  enabled = true,
			  description = "Verify patient user is able to play video through eduaction menu")
	   public void playVideo() throws InterruptedException {
	  loginPage.loginWithPatient(prop.getProperty("usernamePatient"),
	  prop.getProperty("password")); 
	  loginPage.clickOnLogin();
	  patientPage.clickOnEducation();
	  
	  educationPage.clickOnVideo(); 
	//  driver.quit();	 
	  String actual = videoPage.videoHeaderText();
	  String expected = "What Can I Eat On Dialysis";
	  Assert.assertEquals(actual, expected);
	  }
	 
	
	  @Test(priority = 4,
			  enabled = true,
				description = "Verify patient user is able to play video through entertainment menu")
	  public void playVideoThrougyEntertaimentTab() throws
	  InterruptedException { loginPage.validateLoginPageTitle(); loginPage.validatedavitaLogo();
	  loginPage.loginWithPatient(prop.getProperty("usernamePatient"),
	  prop.getProperty("password")); 
	  loginPage.clickOnLogin();
	  patientPage.clickOnEntertainment();
	  entertainmentPage.clickOnGoToNextEduTask();
	  educationPage.clickOnVideo();
	  String actual = videoPage.videoHeaderText();
	  String expected = "What Can I Eat On Dialysis";
	  Assert.assertEquals(actual, expected);
	  
	  
	  }
	 
	
	@AfterSuite
	public void tearDown() {
		//driver.quit();
	}
}
