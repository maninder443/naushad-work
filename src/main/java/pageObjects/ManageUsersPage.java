package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.TestBase;

public class ManageUsersPage extends TestBase{
	
	@FindBy(xpath = "//button[@class=\"new-button\"]")
	WebElement createNewUser;
	
	@FindBy(css = "div.full-page div.user-container div")
	WebElement manageUserTitle;
	
	@FindBy(xpath = "//*[text()='Naushad Alam']")
	WebElement createdUserDisplay;
	
	public ManageUsersPage() {
		PageFactory.initElements(driver, this);	
	}
	

	public String titleOfManageUsersPage() {
		return manageUserTitle.getText();
	}
	
	public NewUserPage clickOnNewUsers() {
		createNewUser.click();
		return new NewUserPage();	 
	}
	
	public  boolean createdUserDisplay() {
		return createdUserDisplay.isDisplayed();	 
	}

}
