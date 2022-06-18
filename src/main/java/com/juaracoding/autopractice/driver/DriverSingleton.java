package com.juaracoding.autopractice.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.juaracoding.autopractice.driver.DriverSingleton;

public class DriverSingleton {

	private static DriverSingleton instance = null;
	private static WebDriver driver;
	
	public DriverSingleton() {
		instantiate("chrome");
	}
	
	public WebDriver instantiate(String strategy) {
		DriverStrategy driverStrategy = DriverStrategyImplementator.chooseStrategy(strategy);
		driver = driverStrategy.seStrategy();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
}
	public static DriverSingleton getInstance() {
		if(instance == null) {
			instance = new DriverSingleton();
		}
		
		return instance;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
