package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage clickLogoutButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}

	public MyHomePage clickcrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

	public HomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}

}
