package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{

	public ViewLeadPage(ChromeDriver driver) {
	this.driver=driver;
	}
	
public ViewLeadPage verifyFirstName() {
	System.out.println(driver);
	String text=driver.findElement(By.id("viewLead_firstName_sp")).getText();
	Assert.assertEquals("Merlin",text);
	return this;
}
}
