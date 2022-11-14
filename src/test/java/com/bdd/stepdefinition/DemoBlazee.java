package com.bdd.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoBlazee extends TestExecutor{
	
	
	@Given("User launch the browser and open a url")
	public void user_launch_the_browser_and_open_a_url() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\neworkspace\\SeleniumWeekday_Oct\\exe\\chromedriver.exe");
			
			driver= new ChromeDriver();
			
		
			driver.manage().window().maximize();
			
			driver.get("https://www.demoblaze.com/index.html");
			
	
	}

	@When("User click login button")
	public void user_click_login_button() {
	  
		hmpg.clickLoginLink();
	
	}

	@When("User enter value in username filed {string}")
	public void user_enter_value_in_username_filed(String uname) {
		
	hmpg.enterUsername(uname);
	
	}

	@When("User enter {string} in password field")
	public void user_enter_in_password_field(String passwrd) {
		

		hmpg.enterpassword(passwrd);
	   
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		hmpg.clickloginbutton();
	   
	}

	@Then("User validate the page title")
	public void user_validate_the_page_title() {
	   
	hmpg.validatePageTitle();

	}
	
	@When("user click the first product")
	public void user_click_the_first_product() throws InterruptedException {
	   hmpg.clickFrstProd();
	}

	@When("User click Add to cart button")
	public void user_click_Add_to_cart_button() {
		prodpg.clickAddToCartButton();
	  
	}

	@Then("User validate the succsess msg")
	public void user_validate_the_succsess_msg() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
