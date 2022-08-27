package com.juaracoding.pageobjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;
import com.juaracoding.pageobjects.pages.SearchWishlist;

public class TestSearchWishlist {

		public static WebDriver driver;
		private SearchWishlist searchWishlist;
		
		
		@BeforeClass
		public void setUp() {
			DriveriSingleton.getInstance("Chrome");
			driver = DriveriSingleton.getDriver();
			String url = "https://shop.demoqa.com/";
			driver.get(url);
		}

		@BeforeMethod
		public void pageObject() {
			searchWishlist = new SearchWishlist();
		}

		@Test
		public void testSearch() {
			searchWishlist.klikSearch();
			searchWishlist.searchInput();
			scroll(700);
			searchWishlist.searchInput();
			searchWishlist.searchInput();
			searchWishlist.searchInput();
			scroll(700);
			searchWishlist.getTxtTshirtOne();
			System.out.println(searchWishlist.getTxtTshirtOne());
			String txt = searchWishlist.getTxtTshirtOne();
			assertTrue(txt.contains("T-shirt"));
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
			js.executeScript("window.scrollBy(0," + vertical + ")");
		}
}
