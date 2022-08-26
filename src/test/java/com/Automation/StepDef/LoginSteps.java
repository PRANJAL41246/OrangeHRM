package com.Automation.StepDef;

import com.Automation.Generic.Utils.DriverUtils;
import com.Automation.Generic.Utils.PropertyReader;
import com.Automation.Page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	LoginPage lp= new LoginPage();
	
	@Given("Open the browser")
	public void open_the_browser() {
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	  

	@When("Enter valid username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
		// using feature 
		//  lp.enterUsername(string);
		//   lp.enterPassword(string2);
		
		//using propertyreader
	    lp.enterUsername(PropertyReader.getProperty("Username"));
	    lp.enterPassword(PropertyReader.getProperty("Password"));
	    lp.clickbtnLogin();
	}

	@Then("execute sucessfully.")
	public void execute_sucessfully() {
	 System.out.println(DriverUtils.getDriver().getTitle());
		
	}

}