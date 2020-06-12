package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.TestBase;

public class AdminPage extends TestBase{
	
	
	@FindBy(linkText = "Manage Users")
	WebElement ManageUsers;
	
	@FindBy(linkText = "Logout")
	WebElement Logout;
	
	@FindBy(css = "img.davita-img")
	WebElement davitaImg;
	
	public AdminPage() {
		PageFactory.initElements(driver, this);	
	}
	

	public String verifyManageUsersHomePage() {
		return driver.getTitle();
	}
	
	public ManageUsersPage clickOnManageUsers() {
		ManageUsers.click();
		return new ManageUsersPage();
		 
	}
	
	public LoginPage clickOnLogout() {
		Logout.click();
		return new LoginPage(); 
	}
	
	public boolean davitaImg() {
		return davitaImg.isDisplayed();
		 
	}

}
