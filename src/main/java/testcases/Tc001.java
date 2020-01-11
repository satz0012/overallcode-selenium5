package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.Searchpage;



public class Tc001 extends ProjectSpecificMethods {
	
	@Test
	public void seat() throws InterruptedException
	{
		new Searchpage()
		.enterfromdestination()
		.entertodestination()
		.calendar()
		.buttonclick()
		.buttonseat()
		.seatvalidate();
		

		
		
		
	}
	

}
