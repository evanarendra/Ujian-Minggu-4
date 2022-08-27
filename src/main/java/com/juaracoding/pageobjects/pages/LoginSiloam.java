package com.juaracoding.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;

public class LoginSiloam {
	
private WebDriver driver;
	
	public LoginSiloam() {
		this.driver = DriveriSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	public void login(String username, String password) {
		
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		btnLogin.click();
	}
	public String getAttributeRequired() {
		return username.getAttribute("required");
	}
}
