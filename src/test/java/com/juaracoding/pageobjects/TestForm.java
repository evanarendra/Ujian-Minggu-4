package com.juaracoding.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;
import com.juaracoding.pageobjects.pages.SampleForm;

public class TestForm {
	public static WebDriver driver;
	private SampleForm sampleForm;
	
	
	@BeforeClass
	public void setUp() {
		DriveriSingleton.getInstance("Chrome");
		driver = DriveriSingleton.getDriver();
		String url = "https://demoqa.com/automation-practice-form";
		driver.get(url);
	}

	@BeforeMethod
	public void pageObject() {
		sampleForm = new SampleForm();
	}

	@Test
	public void testForm() {
		sampleForm.pilihGender(0);
		sampleForm.pilihGender(1);
		sampleForm.pilihGender(2);
		scroll(700);
		sampleForm.pilihHobbies(0);
		sampleForm.pilihHobbies(1);
		sampleForm.pilihHobbies(2);
		sampleForm.uploadGambar();
		
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
	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+ vertical +")");
	}
}
