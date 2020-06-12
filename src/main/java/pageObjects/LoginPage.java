package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePackage.TestBase;

public class LoginPage extends TestBase{
	

	@FindBy(name = "userType")
     WebElement selectUserType;
	
	@FindBy(xpath="//*[text()=' Patient ']")
	WebElement selectPatient;
	
	@FindBy(xpath="//*[text()=' Admin ']")
	WebElement selectAdmin;
	
	@FindBy(id="mat-input-0")
	WebElement userName;
	
	@FindBy(id="mat-input-1")
	WebElement passwordr;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base']")
	WebElement loginBttn;
	
	
	@FindBy(xpath = "//img[@alt=\"davita logo\"]")
	WebElement davitaLogo;
	
	@FindBy(css = "section.form h2")
	WebElement loginPageText;
	
	public WebElement un;

	public WebElement pwd;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}

	//Actions:
		public String validateLoginPageTitle(){
		//	return driver.getTitle();
			String title = driver.getTitle();
			Assert.assertEquals(title, "DaVita-Pilot");
			return title;
		}
		public String loginPageText(){
			return loginPageText.getText();
		}
			
		
		public boolean validatedavitaLogo(){
			//return davitaLogo.isDisplayed();
			boolean flag = davitaLogo.isDisplayed();
			Assert.assertTrue(flag);
			return flag;
		}
		
	
	  public PatientPage clickOnLogin(){
		  loginBttn.click(); 
	      return new PatientPage(); }
	 
		       // landing page
		
		public PatientPage loginWithPatient(String un, String pwd){
		  // this.un=userName; this.pwd=passwordr;
			
		/*
		 * selectUserType.click(); selectPatient.click();
		 */
		  
		
		  userName.clear();
		  passwordr.clear();
		  userName.sendKeys(un); 
		  passwordr.sendKeys(pwd);
		 

		//	loginBttn.click();
			
			return new PatientPage();
		}
	
		public AdminPage loginWithAdmin(String un, String pwd){
		
		  this.un=userName; 
		  this.pwd=passwordr;
		 
			selectUserType.click();
			selectAdmin.click();
			userName.clear();
			passwordr.clear();
			userName.sendKeys(un);
		//	passwordr.clear();
			passwordr.sendKeys(pwd);
		//	loginBttn.click();
			
			return new AdminPage();
		}
}
