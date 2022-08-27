package com.juaracoding.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;

public class Modal {
	
	private WebDriver driver;

	public Modal() {
		this.driver = DriveriSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='showSmallModal']")
	private WebElement btnSmallModal;
	
	@FindBy(xpath = "//div[@id='example-modal-sizes-title-sm']")
	private WebElement titleModal;
	
	@FindBy(xpath = "//div[@class='modal-body']")
	private WebElement txtBodyModal;

	private WebElement txtTitleModal;
	
	public void clickSmallModal( ) {
		btnSmallModal.click();
	}
	
	public String getTitleModal() {
		return titleModal.getText();
	}
	
	public String getBodyModal() {
		return txtBodyModal.getText();
	}
}
