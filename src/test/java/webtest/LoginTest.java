package webtest;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured.*;
import static org.testng.Assert.*;

import org.assertj.core.api.Assertions;

import com.utils.ReadProp;
import com.webpage.DashboardPage;
import com.webpage.LoginPage;

import io.qameta.allure.Description;
import io.restassured.internal.common.assertion.Assertion;
import testbase.TestBase;


public class LoginTest extends TestBase{
	@Test
	@Description("Enter email and password and click on submit and verify that Dashboard is visible")
	public void testWithValidScenario() throws Exception
	{
		
		LoginPage login=new LoginPage();
		DashboardPage dashboard=login.LoginVWO().afterLoginDash();
		String expectedusername=dashboard.loggerInLogin();
		//Assert.assertEquals(expectedusername,"Wingify");
		Assertions.assertThat(expectedusername).isNotNull().isNotBlank().contains(ReadProp.readconfig("expected_username"));
		takescreenShot("verify Dashboard");
		
	}

}
