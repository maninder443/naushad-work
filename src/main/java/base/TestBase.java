package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import utils.ExtentReportListner;


@Listeners(ExtentReportListner.class)
public class TestBase extends ExtentReportListner {
	

 public static Properties prop;
	 
	 public TestBase()
		{
			try 
			{
			prop= new Properties();
			FileInputStream ip= new FileInputStream(".\\src\\main\\java\\config\\config.properties");
			prop.load(ip);
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
		    }
		}
	 
	 
	 
//	 public static ResponseOptions<Response> tokenGeneration (String token)
		{
		 
		 
		
				
			//		request.header( new Header("Authorisation","bearer"+"token"));
					
				
		 
        }
}
