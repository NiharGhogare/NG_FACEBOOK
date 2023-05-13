package com.fb.qa.Testcases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.page.LoginPage;



public class loginpagetest extends TestBase{
LoginPage loginp;
	
	public loginpagetest() throws IOException {
		super();
		
	}
@BeforeMethod
public void setup() throws IOException {
	initialization();
	loginp = new LoginPage();
	
}
@Test (priority=1)
public void userlogin() throws InterruptedException {
	loginp.validatelogin(props.getProperty("Username"), props.getProperty("Password"));
}
@Test(priority=2)
public void title() throws InterruptedException {
	String rahul= loginp.ValidateLoginpagetitle();
	System.out.println(rahul);
}

	

@AfterMethod
public void teardown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}
}

