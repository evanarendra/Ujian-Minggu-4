package com.juaracoding.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;

public class SearchWishlist {
	
	private WebDriver driver;

	public SearchWishlist() {
		this.driver = DriveriSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement inputSearch;
//	
	
	@FindBy(css = ".add_to_wishlist.single_add_to_wishlist[href='?add_to_wishlist=1485&_wpnonce=59f93f1fd6']")
	private WebElement wishlistOne;
	
	@FindBy(css = ".add_to_wishlist.single_add_to_wishlist[href='?add_to_wishlist=1441&_wpnonce=59f93f1fd6']")
	private WebElement wishlistTwo;
	
	@FindBy(xpath = "//div[contains(@class,'yith-wcwl-add-to-wishlist add-to-wishlist-1441 exists wishlist-fragment on-first-load')]//a[contains(text(),'Browse Wishlist')]")
	private WebElement wishlistList;
	
	@FindBy(css = "tr[id='yith-wcwl-row-1441'] td[class='product-name'] a")
	private WebElement tshirtOne;

	@FindBy(css = "tr[id='yith-wcwl-row-1485'] td[class='product-name'] a")
	private WebElement tshirtTwo;
	
	public void klikSearch() {
		btnSearch.click();
	}
	
	public void searchInput() {
		this.inputSearch.sendKeys("T-shirt" + "\n");
	}
	
	public void wishlistOne() {
		wishlistOne.click();
	}
	
	public void wishlistTwo() {
		wishlistTwo.click();
	}
	
	public void wishlistList() {
		wishlistList.click();

	}

	public String getTxtTshirtOne() {
		return tshirtOne.getText();
	}

	public String getTxtTshirtTwo() {
		return tshirtTwo.getText();
	}
	
	
}
