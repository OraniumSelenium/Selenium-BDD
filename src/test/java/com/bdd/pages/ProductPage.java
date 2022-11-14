package com.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.stepdefinition.TestExecutor;

public class ProductPage extends TestExecutor{
	
	public static By addToCartButton = By.xpath("//a[text()='Add to cart']");
	
	
	public void clickAddToCartButton()
	{
		WebElement addToCart = driver.findElement(addToCartButton);
		addToCart.click();
	}
	

}
