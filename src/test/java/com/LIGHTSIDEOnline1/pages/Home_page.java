package com.LIGHTSIDEOnline1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LIGHTSIDEOnline1.utilities.Driver;

public class Home_page {
private WebDriver driver;
	
	public Home_page() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver,  this);
	}
	
	
	@FindBy(xpath="//h1[@class='title']")
	public WebElement titleVA;

	
}
