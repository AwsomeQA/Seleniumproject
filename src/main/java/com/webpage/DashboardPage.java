package com.webpage;

import org.openqa.selenium.By;

import com.base.BaseClass;

public class DashboardPage extends BaseClass{
	protected DashboardPage()
	{
		super();
	}
	
	By dash=By.xpath("//p[@class='page-sub-title']/span[text()='Wingify']");
	
	public String loggerInLogin()
	{
		waitForWebelement(dash);
		return readText(dash);
	}


}
