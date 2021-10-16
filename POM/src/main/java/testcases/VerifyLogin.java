package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethod {

	@Test
	public void runLogin() throws InterruptedException {
		System.out.println(driver);
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername().enterPassword().clickLoginButton().verifyHomePage();

	}

}