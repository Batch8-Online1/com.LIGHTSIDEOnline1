package com.LIGHTSIDEOnline1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LIGHTSIDEOnline1.utilities.Driver;

public class Signin_page {
	
	private WebDriver driver;
	
	public Signin_page() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver,  this);
	}
	
	@FindBy(xpath="//input[@placeholder='email']")
	public WebElement emailBox;
	
	
	@FindBy(xpath="//input[@placeholder='password']")
	public WebElement passwordBox;	
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement singinButton;
	
	@FindBy(xpath="//div[@class='cdk-live-announcer-element cdk-visually-hidden']")
	public WebElement errorMessage;
	
	
	

}
