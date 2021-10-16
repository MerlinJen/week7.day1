package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod {
public ChromeDriver driver;
@BeforeMethod
public void preCondition() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
}
@AfterMethod
public void postCondition() {
	driver.close();
}
}
