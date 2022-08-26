package com.Automation.StepDef;

import com.Automation.Generic.Utils.DriverUtils;
import com.Automation.Generic.Utils.PropertyReader;

import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void precondition()
	{ 
		
		DriverUtils.createDriver();
		PropertyReader.initProperty();
	}

}
