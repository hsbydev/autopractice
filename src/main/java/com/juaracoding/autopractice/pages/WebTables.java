package com.juaracoding.autopractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.autopractice.driver.DriverSingleton;

public class WebTables {

private WebDriver driver;

	public WebTables() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	//Locator
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnAdd;
	
	@FindBy(id = "email_create")
	private WebElement email;
	
//	@FindBy(id = "days")
//	private WebElement d;
//	Select s1 = new Select(d);
//	
//	@FindBy(id = "months")
//	private WebElement m;
//	Select s2 = new Select(m);
//	
//	@FindBy(id = "years")
//	private WebElement y;
//	Select s3 = new Select(y);
//	
//	@FindBy(id = "id_state")
//	private WebElement s;
//	Select state = new Select(s);
//	
	
	
	
	
	public void registrationForm() {
		btnAdd.click();
		email.sendKeys("hasbyyyalq@gmail.com");
		driver.findElement(By.cssSelector("#SubmitCreate > span")).click();

		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Hasby");
		driver.findElement(By.id("customer_lastname")).sendKeys("Al");
		driver.findElement(By.id("passwd")).sendKeys("hass00");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
	}
	

	



	public void registrationAddress() {
		driver.findElement(By.id("firstname")).sendKeys(" ");
		driver.findElement(By.id("lastname")).sendKeys(" ");
		driver.findElement(By.id("company")).sendKeys("Astra");
		driver.findElement(By.id("address1")).sendKeys("St.Selenium No.6");
		driver.findElement(By.id("address2")).sendKeys("Jawa");
		driver.findElement(By.id("city")).sendKeys("Bekasi");
		driver.findElement(By.id("postcode")).sendKeys("17610");
		driver.findElement(By.id("other")).sendKeys("hai");
		driver.findElement(By.id("phone")).sendKeys("88983313");
		driver.findElement(By.id("phone_mobile")).sendKeys("0867789942");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("mamat");
		driver.findElement(By.id("submitAccount")).click();	
		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a")).click();
	}
	
	public void signIn() {
		driver.findElement(By.id("email")).sendKeys("hasbyyyalq@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("hass00");
		driver.findElement(By.id("SubmitLogin")).click();
	}
}
