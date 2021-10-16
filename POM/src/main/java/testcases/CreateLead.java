package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethod{
	
	@Test
	public void runCreateLead() throws InterruptedException {
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickcrmsfa()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadButton()
		.verifyFirstName();
}
}