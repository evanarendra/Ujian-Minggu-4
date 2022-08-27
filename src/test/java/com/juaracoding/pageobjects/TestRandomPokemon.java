package com.juaracoding.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;
import com.juaracoding.pageobjects.pages.RandomPokemon;

public class TestRandomPokemon {

	public static WebDriver driver;
	private RandomPokemon randomPokemon;

	@BeforeClass
	public void setUp() {
		DriveriSingleton.getInstance("Chrome");
		driver = DriveriSingleton.getDriver();
		String url = "https://randompokemon.com";
//		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);
	}

	@BeforeMethod
	public void pageObject() {
		randomPokemon = new RandomPokemon();
	}

	@Test
	public void testGeneratePokemon() {
		randomPokemon.generatePokemon();

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
