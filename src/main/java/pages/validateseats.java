package pages;

import base.ProjectSpecificMethods;

public class validateseats extends ProjectSpecificMethods  {
	public Viewbuses buttonseat() throws InterruptedException
	{
		driver.findElementByXPath("(//div[text()='View Seats'])[1]").click();
		Thread.sleep(1000);
		
		Viewbuses hmk=new Viewbuses();
		return hmk;
		
		
		
	}
	
	
	
	

}
