package com.juaracoding.autopractice.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver seStrategy() {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
