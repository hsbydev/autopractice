package com.juaracoding.autopractice.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Chrome implements DriverStrategy{

	public WebDriver seStrategy() {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
