package com.Automation.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	@FindBy(name="username") private WebElement userinput;
	@FindBy(name="password") private WebElement passwordinput;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	
	 /*public void logindetails(String name , String password ) {
           userinput.sendKeys(name);
           passwordinput.sendKeys(password);
           loginButton.click();
} */

	public void enterUsername(String username) {
		userinput.sendKeys(username);
		
		
	}
	
	
	
	public void enterPassword(String password) {
		passwordinput.sendKeys(password);
		
	}


	

	public void clickbtnLogin() {
		loginButton.click();
		
	}
}