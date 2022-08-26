package com.Automation.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.Automation.Generic.Utils.DriverUtils;

public class BasePage {
	WebDriver driver;
	 public BasePage() {
		// TODO Auto-generated constructor stub
		 driver=DriverUtils.getDriver();
		 PageFactory.initElements(driver, this);
	}

}
