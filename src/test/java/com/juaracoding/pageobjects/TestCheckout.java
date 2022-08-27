package com.juaracoding.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;
import com.juaracoding.pageobjects.pages.SearchWishlist;
import com.juaracoding.pageobjects.pagestest19.Checkout;

public class TestCheckout {
	public static WebDriver driver;
	private Checkout checkout;
	
	
	@BeforeClass
	public void setUp() {
		DriveriSingleton.getInstance("Chrome");
		driver = DriveriSingleton.getDriver();
		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);
	}

	@BeforeMethod
	public void pageObject() {
		checkout = new Checkout();
	}

	@Test
	public void testRegis() {
//		checkout.usernameRegis();
//		checkout.emailRegis();
//		checkout.passwordRegis();
//		checkout.regis();
		}
	
	
		
	
	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
