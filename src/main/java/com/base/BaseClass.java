package com.base;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driver.DriverManager;

import io.qameta.allure.Allure;



public class BaseClass {
	public BaseClass(){
		
	}
	public void getUrl(String url)
	{
		DriverManager.getDriver().get(url);
	}
	public void clickElement(By elementlocation)
	{
		DriverManager.getDriver().findElement(elementlocation).click();
	}
	public void clickWebElement(WebElement element)
	{
		element.click();
	}
	public void inputuser(By elementlocation,String text)
	{
		DriverManager.getDriver().findElement(elementlocation).clear();
		DriverManager.getDriver().findElement(elementlocation).sendKeys(text);
	}
	public void writeElementText(WebElement element,String text)
	{
		element.clear();
		element.sendKeys(text);
	}
	public void waitimpli()
	{
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void elementVisible(By elementLocation)
	{
		new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated( elementLocation));
	}
	public void waitForWebelement(By elementLocation)
	{
		new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
	
	}
	public void waitForElementClick(By elementLocation)
	{
		new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(elementLocation));
	}
	public void waitForUrl(String text)
	{
		new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20) ).until(ExpectedConditions.urlContains(text));
	}
	public String readText(By element)
	{
		return DriverManager.getDriver().findElement(element).getText();
		
	}
	


}
