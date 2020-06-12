package SeleniumTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E_Test {
	
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\naushad.alam\\eclipse-workspace\\DaVitaCucumberFramework\\exeFiles\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://staging-dot-davita-pilot.appspot.com");
		 
		
		  
		/*
		 * driver.findElement(By.id("mat-input-0")).clear();
		 * driver.findElement(By.id("mat-input-1")).clear();
		 * 
		 * driver.findElement(By.id("mat-input-0")).sendKeys(
		 * "davita-pilot@mavenwave.com");
		 * driver.findElement(By.id("mat-input-1")).sendKeys("password");
		 * 
		 * WebElement loginBttn = driver.findElement(By.
		 * xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base']"
		 * )); loginBttn.click();
		 * 
		 * driver.findElement(By.linkText("Education")).click(); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//div[@class=\"image-overlay\"]")).click();
		 */
		  
		 
		 
		
		//admin
		driver.findElement(By.name("userType")).click();
	//	driver.findElement(By.xpath("//mat-select[@name=\"userType\"]")).click();
		driver.findElement(By.xpath("//*[text()=' Admin ']")).click();
		
		driver.findElement(By. xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base']")).click();
		
		 
		driver.findElement(By.linkText("Manage Users")).click();
		driver.findElement(By.xpath("//button[@class=\"new-button\"]")).click();
		driver.findElement(By.xpath("//input[@formcontrolname=\"userName\"]")).sendKeys("naushad@gmail.com");
		driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]")).sendKeys("Naushad@5");
		driver.findElement(By.xpath("//input[@formcontrolname=\"confirmPassword\"]")).sendKeys("Naushad@5");
		driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).sendKeys("Naushad");
		driver.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]")).sendKeys("Alam");
		driver.findElement(By.xpath("//input[@formcontrolname=\"birthDate\"]")).sendKeys("03/02/1995");
		
		Select roleType = new Select(driver.findElement(By.xpath("//select[@formcontrolname=\"roleType\"]")));
		roleType.selectByVisibleText("patient");
		
	
		driver.findElement(By.xpath("//input[@formcontrolname=\"phone\"]")).sendKeys("9800948201");
		
		
		WebElement image= driver.findElement(By.xpath("//img[@class=\"user-image\"]"));
		
		Thread.sleep(5000);
		WebElement clinicSrearch= driver.findElement(By.cssSelector("section.clinic-search-bar section input"));
		clinicSrearch.click();
		clinicSrearch.sendKeys("Cortland Dialysis");
		driver.findElement(By.cssSelector("section.clinic-select  svg")).click();
		image.click();
	//	image.sendKeys("C:\\Users\\naushad.alam\\download.png");
	//	System.out.println("imageClick");
		
		//using robot class
		
		  Robot robot= new Robot();
		  
		  robot.setAutoDelay(3000); StringSelection stringSelection = new
		  StringSelection("C:\\Users\\naushad.alam\\download.png");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,
		  null);
		  
		  robot.setAutoDelay(3000);
		  
		  robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		  
		  robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyRelease(KeyEvent.VK_V);
		  
		  robot.setAutoDelay(3000); robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  driver.findElement(By.xpath("//button[@class=\"save-button\"]")).click();
		
	//	  List<WebElement> checkbox = driver.findElements(By.name("user-list-page"));
	        
		 
	//	 driver.quit();
		 

	}

}
