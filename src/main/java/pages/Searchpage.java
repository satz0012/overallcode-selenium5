package pages;

import java.util.concurrent.TimeUnit;
import base.ProjectSpecificMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;




public class Searchpage extends ProjectSpecificMethods {
	
		

		public Searchpage enterfromdestination() throws InterruptedException
		{
			WebElement frmsource = driver.findElementById("src");
			frmsource.sendKeys("chennai");
			Thread.sleep(1000);
			frmsource.sendKeys(Keys.TAB);
			Thread.sleep(1000);
			return this;
		}
		
		public Searchpage entertodestination() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement frmsource1 = driver.findElementById("dest");
			frmsource1.sendKeys("Bangalore");
			Thread.sleep(1000);
			frmsource1.sendKeys(Keys.TAB);
			Thread.sleep(1000);
			return this;
		}
		
		public Searchpage calendar() throws InterruptedException
		{
			//driver.findElementByXPath("//label[@class='db text-trans-uc']").click();
			Thread.sleep(1000);
			driver.findElementByXPath("(//td[text()='12'])[2]").click();
			return this;
		}
		
		public validateseats buttonclick() throws InterruptedException
		{
			driver.findElementByXPath("//button[text()='Search Buses']").click();
			Thread.sleep(1000);
			validateseats hmj=new validateseats();
			return hmj;
			
		}
			







}