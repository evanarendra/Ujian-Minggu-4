package com.juaracoding.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;

public class SampleFrame {

	private WebDriver driver;

	public SampleFrame() {
		this.driver = DriveriSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]")
	private WebElement txtOutFrame;
	
	@FindBy(xpath = "//*[@id='sampleHeading']")
	private WebElement txtFrame;
	
	public String getTxtOutFrame() {
		return txtOutFrame.getText();
	}
	public String getTxtFrame() {
		return txtFrame.getText();
	}
}
