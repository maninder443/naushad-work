package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.TestBase;

public class PatientPage extends TestBase {
	
	@FindBy(linkText = "Education")
	WebElement clickOnEduTab;
	
	
	  @FindBy(xpath = "//*[text()='Surveys']") WebElement clickOnSurveys;
	 
	
	@FindBy(xpath = "//*[text()='Entertainment']")
	WebElement clickOnEntertainment;
	
	@FindBy(css = "span.user-display-text")
	WebElement Patientusername;
	
	@FindBy(css = "app-task-list section h2")
	WebElement dashboardList;
	
	public PatientPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyPatientHomePage() {
		return driver.getTitle();
	}
	
	public EducationPage clickOnEducation() {
		clickOnEduTab.click();
		 return new EducationPage();
	}
	
	public SurveysPage clickOnSurveys() {
		clickOnSurveys.click();
		 return new SurveysPage();
	}
	
	public EntertainmentPage clickOnEntertainment() {
		clickOnEntertainment.click();
		 return new EntertainmentPage();
	}
	
	public String Patientusername() {
		return Patientusername.getText();
		
	}

	public String patientDashboardText() {
		return dashboardList.getText();
		
	}
}
