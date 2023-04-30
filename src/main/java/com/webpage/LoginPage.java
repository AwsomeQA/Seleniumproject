package com.webpage;

import java.sql.DriverManager;

import org.openqa.selenium.By;

import com.base.BaseClass;
import com.utils.ReadProp;



public class LoginPage extends BaseClass {
	public LoginPage()
	{
		super();
	}
	By username=By.id("login-username");
	By pass=By.id("login-password");
	By btnclick=By.id("js-login-btn");
	public void inputUserName(String email)
	{
		inputuser(username,email);
	}
	public void inputPassword(String password)
	{
		inputuser(pass,password);
	}
	public void ButtonClick()
	{
		clickElement(btnclick);
	}
	
	public LoginPage LoginVWO() throws Exception
	{
		getUrl("https://app.vwo.com/#/login");

		inputUserName(ReadProp.readconfig("username"));
		inputPassword(ReadProp.readconfig("pass"));
		ButtonClick();
		return this;
		
	}
	public DashboardPage afterLoginDash()
	{
		return new DashboardPage();
	}

}
