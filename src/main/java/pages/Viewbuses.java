package pages;

import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class Viewbuses extends ProjectSpecificMethods {
	
	public void seatvalidate() throws InterruptedException
	{
		WebElement count = driver.findElementByXPath("(//div[@class='seat-left m-top-30'])[1]");
		String text1 = count.getText();
		System.out.println(text1);

		driver.close();
	
	}
	
	

}
