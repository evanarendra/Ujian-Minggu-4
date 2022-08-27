package com.juaracoding.pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageobjects.drivers.DriveriSingleton;

public class RandomPokemon {

private WebDriver driver;
	
	public RandomPokemon() {
		this.driver = DriveriSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id='n']")
	private WebElement pilihJumlah;
	
	@FindBy(xpath = "//input[@value='Generate']")
	private WebElement btnGenerate;
	
	
	public void generatePokemon() {
		Select select = new Select(pilihJumlah);
		select.selectByValue("3");
		btnGenerate.click();
	}
}
