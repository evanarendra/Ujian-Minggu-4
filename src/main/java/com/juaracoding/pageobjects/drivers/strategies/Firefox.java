package com.juaracoding.pageobjects.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
	
	public WebDriver setStrategy() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\123\\Videos\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		return Driver;
	}
	
}
