package com.juaracoding.pageobjects;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;
import com.juaracoding.pageobjects.pages.LoginSiloam;


public class TestLoginSiloam {
	
	public static WebDriver driver;
	private LoginSiloam loginSiloam;
	
	@BeforeClass
	public void setUp() {
		DriveriSingleton.getInstance("Chrome");
		driver = DriveriSingleton.getDriver();
		String url = "https://dev.ptdika.com/siloam/panel/login";
//		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);
	}
	
	@BeforeMethod
	public void pageObject() {
		loginSiloam = new LoginSiloam();
	}

	@Test
	public void testInvalidLogin() {
		loginSiloam.login("", "");
		System.out.println(loginSiloam.getAttributeRequired());
		assertEquals(loginSiloam.getAttributeRequired(), "true");
	}
	
	@AfterClass 
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
