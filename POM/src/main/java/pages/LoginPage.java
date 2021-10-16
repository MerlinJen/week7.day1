package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	public LoginPage(ChromeDriver driver) {
	this.driver=driver;
	}
public LoginPage enterUsername() {
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	return this;
}
public LoginPage enterPassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	return this;
}
public HomePage clickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new HomePage(driver);
}
}

//Classroom(20 mins): 10 mins Break
//----------------------------------
//(a) Create new maven project for POM implementation
//(b) Add necessary dependencies
//(c) Setup the POM implementation for CreateLead testcase by following below steps
//  1. Create java classes for each page that we navigate in the application
//  2. Create BaseClass for common codes and
// All the pages should extends BaseClass
//  3. Create methods for each actions & verifications in the respective pages
//  4. All the methods in the pages should have return statement.
// The return statement should be based on the control where it is going
// after doing the action
//  5. Control stays same page -> return this
// Control goes to new page -> return new NextPage()
//  6. Create java classes for testcase and extends with         
// BaseClass(ProjectSpecificMethods)