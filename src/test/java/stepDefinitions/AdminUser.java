package stepDefinitions;

import java.awt.AWTException;

import basePackage.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminPage;
import pageObjects.LoginPage;
import pageObjects.ManageUsersPage;
import pageObjects.NewUserPage;

public class AdminUser extends TestBase {
	
	LoginPage lp = new LoginPage();
	AdminPage ap = new AdminPage();
	ManageUsersPage mp = new ManageUsersPage();
	NewUserPage np = new NewUserPage();
	
	 public AdminUser() { 
		  super(); 
		  }

	@Given("user navigate to the login page and select admin")
	public void user_navigate_to_the_login_page_and_select_admin() {
		System.out.println("User is on DaVita Login Page and select admin");
	}

	@When("user submit username and password under admin")
	public AdminPage user_submit_username_and_password_under_admin() {
		System.out.println("User submitted username and password under admin"); 
		
		lp = new LoginPage();
		lp.loginWithAdmin(prop.getProperty("usernameAdmin"), prop.getProperty("password"));
		return new AdminPage();
	}

	@Then("user should be logged in successfully under admin")
	public void user_should_be_logged_in_successfully_under_admin() {
		System.out.println("User logged in successfully under admin");
	}

	@Given("user is on admin home page")
	public void user_is_on_admin_home_page() {
		System.out.println("User is on DaVita Login Page");
	}

	@When("user click on manage users menu")
	public void user_click_on_manage_users_menu() {
		System.out.println("User is on admin home page");
		ap.clickOnManageUsers();
	}

	@Then("click on +newUser tab")
	public void click_on_newUser_tab() {
		System.out.println("User click on +newUser tab");
		mp.clickOnNewUsers();
	}

	@And("create a new user page will appear")
	public void create_a_new_user_page_will_appear() {
		System.out.println("create a new user page will appear for creating a new user");
	}

	@Then("provide custom details as per require in page")
	public void provide_custom_details_as_per_require_in_page() throws AWTException {
		System.out.println("User provide custom details as per requirement in page");
		np.createANewUserForm(
				prop.getProperty("username"),
				prop.getProperty("pwd"),
				prop.getProperty("retypePassword"),
				prop.getProperty("fName"),
				prop.getProperty("LName"),
				prop.getProperty("dob"),
				prop.getProperty("clinicSearch"),
				prop.getProperty("phoneNo"));
	}

	@Then("click on save user button")
	public void click_on_save_user_button() {
		System.out.println("User click on save user button");
	}
}
