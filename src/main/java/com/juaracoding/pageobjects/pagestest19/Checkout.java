package com.juaracoding.pageobjects.pagestest19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;

public class Checkout {
	private WebDriver driver;

	public Checkout() {
		this.driver = DriveriSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement userRegis;

	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement emailRegis;

	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement passwordRegis;

	@FindBy(xpath = "//button[@name='register']")
	private WebElement btnRegis;

	// Login
	@FindBy(xpath = "//input[@id='user_login']")
	private WebElement usernameLogin;

	@FindBy(xpath = "//input[@id='user_pass']")
	private WebElement passwordLogin;

	@FindBy(xpath = "//input[@id='wp-submit']")
	private WebElement btnLogin;

	@FindBy(xpath = "//a[normalize-space()='Orders']")
	private WebElement btnOrder;

	@FindBy(xpath = "//a[@class='woocommerce-Button button']")
	private WebElement btnBrowse;

	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnSearch;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement inputSearch;

	@FindBy(xpath = "//div[@class='noo-product-inner']//a[normalize-space()='black lux graphic t-shirt']")
	private WebElement scrollShirt;

	@FindBy(css = ".compare.button[href='https://shop.demoqa.com?action=yith-woocompare-add-product&id=1485']")
	private WebElement compareOne;

	@FindBy(xpath = "//*[@id=\"cboxClose\"]")
	private WebElement closeWindow;

	@FindBy(xpath = "//a[normalize-space()='black ribbed short sleeve lettuce hem midi dress']")
	private WebElement clickProductTitle;

	@FindBy(xpath = "//div[@class='summary entry-summary']//a[@class='compare button'][normalize-space()='Compare']")
	private WebElement compareTwo;

	@FindBy(css = "a[aria-label='Select options for �black ribbed short sleeve lettuce hem midi dress�']")
	private WebElement selectProduct;

	@FindBy(xpath = "//select[@id='pa_color']")
	private WebElement selectColor;

	@FindBy(xpath = "//select[@id='pa_size']")
	private WebElement selectSize;

	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement btnAddToCart;

	@FindBy(xpath = "//a[@class='button wc-forward']")
	private WebElement viewCart;

	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	private WebElement proceedCheckout;

	@FindBy(xpath = "//input[@id='billing_first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='billing_last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='billing_company']")
	private WebElement companyName;

	@FindBy(css = "#billing_address_1")
	private WebElement houseNumber;

	@FindBy(xpath = "//input[@id='billing_address_2']")
	private WebElement suiteUnit;

	@FindBy(xpath = "//input[@id='billing_city']")
	private WebElement townCity;

	@FindBy(css = "#select2-billing_state-container")
	private WebElement selectProvice;

	@FindBy(xpath = "//input[@role='combobox']")
	private WebElement inputProvince;

	@FindBy(xpath = "//input[@id='billing_postcode']")
	private WebElement inputPostcode;

	@FindBy(xpath = "//input[@id='billing_phone']")
	private WebElement inputPhone;
	
	@FindBy(xpath = "//textarea[@id='order_comments']")
	private WebElement inputNote;
	
	@FindBy(xpath = "//input[@id='terms']")
	private WebElement agreeBox;
	
	@FindBy(xpath = "//button[@id='place_order']")
	private WebElement btnPlacedOrder;


	public void usernameRegis() {
		userRegis.sendKeys("evanarendra");
	}

	public void emailRegis() {
		emailRegis.sendKeys("evanarendra7@gmail.com");
	}

	public void passwordRegis() {
		passwordRegis.sendKeys("apayaatuhan");
	}

	public void regis() {
		btnRegis.click();
	}
	
	public void usernameLogin() {
		usernameLogin.sendKeys("evanarendra");
	}

	public void passwordLogin() {
		passwordLogin.sendKeys("evanarendra7@gmail.com");
	}

	public void btnLogin() {
		btnLogin.click();
	}

	public void btnOrder() {
		btnOrder.click();
	}

	public void btnBrowse() {
		btnBrowse.click();
	}

	public void search() {
		btnSearch.click();
	}

	public void searchInput() {
		inputSearch.sendKeys("shirt" + "\n");
	}

	public void compareOne() {
		compareOne.click();
	}

	public void closeWindow() {
		closeWindow.click();

	}

	public void clickProductTitle() {
		clickProductTitle.click();
	}

	public void compareTwo() {
		compareTwo.click();
	}

	public void selectProduct() {
		selectProduct.click();

	}

	public void addCart() {
		Select select = new Select(selectColor);
		select.selectByValue("black");
		delay(3);
		selectColor.click();

		Select selectOne = new Select(selectSize);
		selectOne.selectByValue("medium");
		delay(3);
		selectSize.click();
		btnAddToCart.click();
	}

	public void viewCart() {
		viewCart.click();
	}

	public void proceedCheckout() {
		proceedCheckout.click();
	}

	public void firstName() {
		firstName.sendKeys("Evan");
	}

	public void lastName() {
		lastName.sendKeys("QA");

	}

	public void companyName() {
		companyName.sendKeys("PT DIKA");
	}

	public void houseNumber() {
		houseNumber.sendKeys("II/34");
	}

	public void suiteUnit() {
		suiteUnit.sendKeys("Block O");
	}

	public void townCity() {
		townCity.sendKeys("Jakarta");
	}

	public void selectProvice() {
		selectProvice.click();

	}

	public void inputProvince() {
		inputProvince.sendKeys("Jak" + "\n");
	}
	
	public void inputPostcode() {
		inputPostcode.sendKeys("55225");
	}
	
	public void inputPhone() {
		inputPhone.sendKeys("0812345678");
	}
	
	public void inputNote() {
		inputNote.sendKeys("Go Package it!");
	}
	
	public void agreeBox() {
		agreeBox.click();
	}
	
	public void btnPlacedOrder() {
		btnPlacedOrder.click();
	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
