package com.fb.qa.base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.fb.qa.Util.TestUtil;



public class TestBase {
	public static WebDriver driver;
	public static Properties props;
	

	public TestBase() throws IOException {
		props = new Properties();
		 
		FileInputStream ip= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\NG_FACEBOOK"
				+ "\\src\\main\\java\\com\\fb\\qa\\config\\"
				+ "config.properties");
		props.load(ip);
		
	}
	public static void initialization() {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		driver.get(props.getProperty("url"));
		
	}
}

