package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.TestBase;

public class VideoPage extends TestBase {
	
	@FindBy(css = "div.ps body h2")
	WebElement videoHeader;

	public VideoPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String videoHeaderText() {
		return videoHeader.getText();		
	}
	
}
