package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.TestBase;

public class EntertainmentPage extends TestBase{
	
	@FindBy(xpath = "//button[@class=\"mat-focus-indicator goto-button mat-button mat-button-base\"]")
	WebElement GoToNextEduTask;
	
	public EntertainmentPage() {
		PageFactory.initElements(driver, this);
		
	}

	public  EducationPage clickOnGoToNextEduTask() {
		GoToNextEduTask.click();
		 return new EducationPage();
	}
}
