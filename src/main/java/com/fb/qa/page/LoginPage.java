package com.fb.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class LoginPage extends TestBase {
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		}

		@FindBy(id="email") WebElement Username;
		@FindBy(id="pass") WebElement Password;
		@FindBy(xpath="//button[text()=\"Log in\"]") WebElement LoginButton;
		
		
		
		public String ValidateLoginpagetitle() throws InterruptedException {
			Thread.sleep(3000);
			return driver.getTitle();
			
		}
		public void validatelogin(String User, String Pass) throws InterruptedException {
			Username.sendKeys(User);
			Thread.sleep(3000);
			Password.sendKeys(Pass);
			Thread.sleep(3000);
			LoginButton.click();
			
			
			
		}
		
	
		
	

}
