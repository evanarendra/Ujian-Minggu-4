package com.juaracoding.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	public void testCheckout() {
		delay(3);
		scroll(700);
		checkout.usernameRegis();
		checkout.emailRegis();
		checkout.passwordRegis();
		checkout.regis();
		System.out.println("Sukses Regis.");
		
		delay(3);
		checkout.usernameLogin();
		checkout.passwordLogin();
		checkout.btnLogin();
		System.out.println("Sukses Login.");
		
		delay(3);
		checkout.btnOrder();
		System.out.println("halaman pemesanan.");
		checkout.btnBrowse();
		System.out.println("menginginkan produk lain?");
		checkout.search();
		checkout.searchInput();
		System.out.println("sukses pencarian");
		
		delay(3);
		checkout.compareOne();
		System.out.println("Anda menambah produk untuk dibandingkan.");
		delay(3);
		checkout.closeWindow();
		
		delay(3);
		checkout.clickProductTitle();
		System.out.println("melihat halaman detail produk.");
		
		scroll(700);

		delay(3);
		checkout.compareTwo();
		System.out.println("Menambahkan produk pembanding.");

		delay(3);
		driver.switchTo().frame(driver.findElement(By.cssSelector("#cboxLoadedContent > iframe")));

		delay(3);
		checkout.selectProduct();
		System.out.println("pilih detail produk.");
		
		delay(3);
		scroll(700);
		checkout.addCart();
		System.out.println("memilih produk ke dalam keranjang.");
		checkout.viewCart();
		System.out.println("anda telah melihat.");
		
		scroll(700);
		checkout.proceedCheckout();
		System.out.println("proses keranjang belanja.");
		delay(3);
		
		scroll(700);
		checkout.firstName();
		checkout.lastName();
		checkout.companyName();
		scroll(300);
		
		delay(3);
//		postTestNineteen.selectIndo();
		
		delay(3);
		checkout.houseNumber();
		checkout.suiteUnit();
		checkout.townCity();
		
		delay(3);
		checkout.selectProvice();
		checkout.inputProvince();
		
		delay(3);
		checkout.inputPostcode();
		checkout.inputPhone();
		checkout.inputNote();
		System.out.println("sukses memasuki tagihan belanja.");
		
		delay(3);
		scroll(-300);
		checkout.agreeBox();
		
		delay(3);
		checkout.btnPlacedOrder();
		System.out.println("pesanan telah dibuat.");
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
