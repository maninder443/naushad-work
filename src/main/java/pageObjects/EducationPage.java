package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.TestBase;

public class EducationPage extends TestBase{
	
	@FindBy(xpath="//div[@class=\"image-overlay\"]")
	WebElement clickOnVid;
	
	
	public EducationPage() {
		PageFactory.initElements(driver, this);
		
	}
	

	public String verifyPatientHomePage() {
		return driver.getTitle();
	}
	
	public void clickOnVideo() throws InterruptedException {
		
		
		/*
		 * WebDriverWait wait = new WebDriverWait (driver, 20);
		 * wait.until(ExpectedConditions.VisibilityofElementLocated(By.xpath(""//button[
		 * @value='Save Changes']""))); // WebDriverWait = new WebDriverWait(driver,
		 * timeOutInSeconds)
		 */		Thread.sleep(5000);
		clickOnVid.click();
		 
	}

}
