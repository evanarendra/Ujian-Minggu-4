package com.juaracoding.pageobjects.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobjects.drivers.strategies.DriverStrategy;
import com.juaracoding.pageobjects.drivers.strategies.DriverStrategyImplementer;

public class DriveriSingleton {
	
	private static DriveriSingleton instance = null;
	private static WebDriver driver;
	
	private DriveriSingleton(String driver) {
		instantiate(driver);
	}
	
	
	public WebDriver instantiate(String strategy) {
		DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static DriveriSingleton getInstance(String driver) {
		if (instance == null) {
			instance = new DriveriSingleton(driver);
		}
		return instance;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
}
