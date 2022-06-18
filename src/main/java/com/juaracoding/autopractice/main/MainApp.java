package com.juaracoding.autopractice.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.autopractice.driver.DriverSingleton;
import com.juaracoding.autopractice.pages.WebTables;

public class MainApp {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("https://automationpractice.com");
		
		WebTables webTables = new WebTables();
		webTables.registrationForm();
		//Option
		WebElement d = driver.findElement(By.id("days"));
		Select s1 = new Select(d);
		s1.selectByValue("6");
		
		WebElement m = driver.findElement(By.id("months"));
		Select s2 = new Select(m);
		s2.selectByValue("10");
		
		WebElement y = driver.findElement(By.id("years"));
		Select s3 = new Select(y);
		s3.selectByValue("1998");
		
		WebElement s = driver.findElement(By.id("id_state"));
		Select state = new Select(s);
		state.selectByValue("2");
		
		WebElement c = driver.findElement(By.id("id_country"));
		Select country = new Select(c);
		country.selectByValue("21");
		//
		webTables.registrationAddress();
		webTables.signIn();
		
		
		//
	}
}
