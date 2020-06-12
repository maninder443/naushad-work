package stepDefinitions;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import basePackage.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EducationPage;
import pageObjects.EntertainmentPage;
import pageObjects.LoginPage;
import pageObjects.PatientPage;
import pageObjects.VideoPage;

public class PatientUser extends TestBase {
	
	
	
	LoginPage loginPage;
	PatientPage patientPage ;
	EducationPage educationPage ;
	EntertainmentPage entertainmentPage;
	VideoPage videoPage;
	
	  public PatientUser() { 
	  super(); 
	  }

	@Given("^user navigate to the login page$")
	public void user_navigate_to_the_login_page() throws InterruptedException {
	//	System.out.println("User is on DaVita Login Page");
		initialization();
		
	   
	}

	@When("^user submit username and password$")
	public EducationPage user_submit_username_and_password() throws Throwable{
	//	System.out.println("User Submitted username and password");
		loginPage = new LoginPage();
		loginPage.loginWithPatient(prop.getProperty("usernamePatient"), prop.getProperty("password"));
		return new EducationPage();
	}

	@Then("^user click on login page$")
	public void user_click_on_login_page()throws Throwable {
	//	System.out.println("User click on Login button");
		loginPage.clickOnLogin();
	}

	@Then("^user should be logged in successfully$")
	public void user_should_be_logged_in_successfully() throws Throwable{
	//	System.out.println("User logged to the application with patient successfully");
		patientPage = new PatientPage();
		String actual = patientPage.patientDashboardText();
		String expected = "Today's Tasks";	
		Assert.assertEquals(actual, expected);
	  
	}

	@Given("^user is on patient home page$")
	public void user_is_on_patient_home_page() throws Throwable{
	//	System.out.println("User is on patient home page");
		patientPage = new PatientPage();
		String actual = patientPage.patientDashboardText();
		String expected = "Today's Tasks";	
		Assert.assertEquals(actual, expected);
	    
	}

	@When("^click on Education menu$")
	public void click_on_Education_menu() throws Throwable{
	//	System.out.println("User click on Education");
		patientPage = new PatientPage();
		patientPage.clickOnEducation();
		
	}
	   

	@Then("^click on first video link$")
	public void click_on_first_video_link() throws InterruptedException {
	//	System.out.println("User is on DaVita Login Page");
		educationPage = new EducationPage();
		educationPage.clickOnVideo();
	}

	
	
	@Then("user is able to play video successfully.")
	public void user_is_able_to_play_video_successfully()throws Throwable {
	//	System.out.println("User is able to play video successfully through eduaction menu");  
		videoPage = new VideoPage();
		 String actual = videoPage.videoHeaderText();
		  String expected = "What Can I Eat On Dialysis";
		  Assert.assertEquals(actual, expected);
	}
	

	@Given("^user is on patent user home page$")
	public void user_is_on_patent_user_home_page() throws Throwable{
	//	System.out.println("User is on patent user home page");
		patientPage = new PatientPage();
		String actual = patientPage.patientDashboardText();
		String expected = "Today's Tasks";	
		Assert.assertEquals(actual, expected);
	  
	}

	@When("^click on Entertainment menu$")
	public void click_on_Entertainment_menu()throws Throwable {
	//	System.out.println("User click on Entertainment menu");
		  patientPage = new PatientPage();
		  patientPage.clickOnEntertainment();
		 
	}

	@Then("^click on Go to next education task$")
	public void click_on_Go_to_next_education_task()throws Throwable {
	//	System.out.println("User click on Go to next education task");
	    entertainmentPage = new EntertainmentPage();
		entertainmentPage.clickOnGoToNextEduTask(); 
	}
	
	@And("^click on first video$")
	public void click_on_first_video() throws InterruptedException {
	//	System.out.println("click on first video");
		educationPage = new EducationPage();
		educationPage.clickOnVideo();
	}

	@Then("^video wil play successfully$")
	public void video_wil_play_successfully()throws Throwable {
	// 	System.out.println("video wil play successfully");
		  videoPage = new VideoPage();
		  String actual = videoPage.videoHeaderText();
		  String expected = "What Can I Eat On Dialysis";
		  Assert.assertEquals(actual, expected);
	}

	
	
	


	

}
