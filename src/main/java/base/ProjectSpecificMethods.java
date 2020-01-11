package base;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;







public class ProjectSpecificMethods {
	public static ChromeDriver driver;// static if we use the keyword means the chrome driver object, it will be used in all the pages linked with this class
	
	@BeforeMethod
	public void login()
	{
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
}
//	@AfterMethod
//	public void logout()
//	{
//		driver.close();	
//	}

	

}
