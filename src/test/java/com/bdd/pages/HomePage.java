package com.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.stepdefinition.TestExecutor;

public class HomePage extends TestExecutor{
	
	public static By loginLink = By.xpath("//a[text()='Log in']");
	public static By UsernameTextbox = By.id("loginusername");
	public static By passwordtextbox = By.id("loginpassword");
	public static By loginbutton = By.xpath("//button[text()='Log in']");
	public static By frstprod = By.xpath("(//a[@class='hrefch'])[1]");
	
	
	public void clickLoginLink()
	{
		WebElement loginlink = driver.findElement(loginLink);
		loginlink.click();
	}
	
	
	public void enterUsername(String uname)
	{
		WebElement username = driver.findElement(UsernameTextbox);
		username.click();
		username.clear();
		username.sendKeys(uname);
	}
	
	
	public void enterpassword(String passwrd)
	{
		WebElement password = driver.findElement(passwordtextbox);
		password.click();
		password.clear();
		password.sendKeys(passwrd);
	}
	
	public void clickloginbutton()
	{

		WebElement loginlink = driver.findElement(loginbutton);
		loginlink.click();
	}

	
	public void validatePageTitle()
	{
		
		String currentTitle =	driver.getTitle();
		
		if(currentTitle.equalsIgnoreCase("Store"))
		{
			System.out.println("Expected title is displayed");
		}
		
		else
		{
			System.out.println("expected title is not displayed");
		}
		}


	public void clickFrstProd() throws InterruptedException
	{
Thread.sleep(2000);
		WebElement frsttprod = driver.findElement(frstprod);
		frsttprod.click();
	}
	}

