package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
		}
		
public CreateLeadPage enterFirstName() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	return this;
}
public CreateLeadPage enterLastName() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Merlin");
	return this;
}
public CreateLeadPage enterCompanyName() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jennifer");
	return this;
}
public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);
}
}
