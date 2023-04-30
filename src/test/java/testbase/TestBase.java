package testbase;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.driver.DriverManager;

import io.qameta.allure.Allure;

public class TestBase  {
	@BeforeMethod
	public void setup() {
		DriverManager.init();
	}
	@AfterMethod
	public void finish() {
		DriverManager.teardown();
	}
	public void takescreenShot(String name)
	{
		Allure.addAttachment(name,new ByteArrayInputStream(((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES)));
	}

}
