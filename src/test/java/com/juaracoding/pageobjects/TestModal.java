package com.juaracoding.pageobjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;
import com.juaracoding.pageobjects.pages.Modal;

public class TestModal {

		public static WebDriver driver;
		private Modal modal;
		
		
		@BeforeClass
		public void setUp() {
			DriveriSingleton.getInstance("Chrome");
			driver = DriveriSingleton.getDriver();
			String url = "https://demoqa.com/modal-dialogs";
			driver.get(url);
		}

		@BeforeMethod
		public void pageObject() {
			modal = new Modal();
		}

		@Test
		public void testModal() {
			modal.clickSmallModal();
			System.out.println(modal.getTitleModal());
			System.out.println(modal.getBodyModal());
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
	
