package testCases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.TestBase;
import pageObjects.AdminPage;
import pageObjects.LoginPage;
import pageObjects.ManageUsersPage;
import pageObjects.NewUserPage;

public class LoginWithAdmin extends TestBase {

	LoginPage loginPage;
	AdminPage adminPage;
	ManageUsersPage manageUsersPage;
	NewUserPage newUserPage;

	public LoginWithAdmin() {
		super();
	}

	@BeforeMethod
	public void setUP() {
		initialization();
		loginPage = new LoginPage();
		adminPage = new AdminPage();
		manageUsersPage = new ManageUsersPage();
		newUserPage = new NewUserPage();

	}

	@Test(priority = 2, enabled = false, description = "Validate Admin user is able to logged in successfull into DaVita application by valid credential")
	public void validLogin() {
		loginPage.loginWithAdmin(prop.getProperty("usernameAdmin"), prop.getProperty("password"));
		loginPage.clickOnLogin();
		boolean flag = adminPage.davitaImg();
		Assert.assertTrue(flag);
	}

	@Test(priority = 1, enabled = false, description = "Validate admin user is not able to logged into DaVita application by invalid credential")
	public void invalidLogin() {
		loginPage.validateLoginPageTitle();
		loginPage.validatedavitaLogo();
		loginPage.loginWithAdmin(prop.getProperty("usernameAdmin"), prop.getProperty("pass"));
		loginPage.clickOnLogin();
		String actual = loginPage.loginPageText();
		String expected = "Sign in to your Account";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3, enabled = false, description = "Validate admin user is able to logged out successfull from DaVita application")
	public void VerifyLogout() {
		loginPage.loginWithAdmin(prop.getProperty("usernameAdmin"), prop.getProperty("password"));
		loginPage.clickOnLogin();
		adminPage.clickOnLogout();
		String actual = loginPage.loginPageText();
		String expected = "Sign in to your Account";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 4, enabled = false, description = "Verify admin user is able to cancell new user pop up which appear after clicking +NewUser ")
	public void VerifyCancelNewUserButton() throws InterruptedException {
		loginPage.loginWithAdmin(prop.getProperty("usernameAdmin"), prop.getProperty("password"));
		loginPage.clickOnLogin();
		adminPage.clickOnManageUsers();
		manageUsersPage.clickOnNewUsers();
		newUserPage.clickOnCancelButton();
		String actual = manageUsersPage.titleOfManageUsersPage();
		String expected = "MANAGE USERS";
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 5, enabled = true, description = "Validate admin user is able to creare a custom user")
	public void createNewUser() throws AWTException {
		loginPage.loginWithAdmin(prop.getProperty("usernameAdmin"), prop.getProperty("password"));
		loginPage.clickOnLogin();
		adminPage.clickOnManageUsers();
		manageUsersPage.clickOnNewUsers();
		newUserPage.createANewUserForm(
				prop.getProperty("username"),
				prop.getProperty("pwd"),
				prop.getProperty("retypePassword"),
				prop.getProperty("fName"),
				prop.getProperty("LName"),
				prop.getProperty("dob"),
				prop.getProperty("phoneNo"),
				prop.getProperty("clnSearch"));
		
		boolean flag = manageUsersPage.createdUserDisplay();
		Assert.assertTrue(flag);

	}

/*
	@Test(priority = 6, enabled = false, description = "Validate admin users is able to edit their profile")
	public void VerifyEditProfile() {
		lp.loginWithAdmin(prop.getProperty("usernameAdmin"), prop.getProperty("password"));
		lp.clickOnLogin();
		ap.clickOnManageUsers();
		boolean flag = mp.createdUserDisplay();
		Assert.assertTrue(flag);
*/
//	}
	
}
