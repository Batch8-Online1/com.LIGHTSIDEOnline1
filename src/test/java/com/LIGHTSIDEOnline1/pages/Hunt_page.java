package com.LIGHTSIDEOnline1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LIGHTSIDEOnline1.utilities.Driver;

public class Hunt_page {
private WebDriver driver;
	
	public Hunt_page() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver,  this);
	}
	
	@FindBy(css="#date")
	public WebElement dateBox;
	
	@FindBy(xpath="//select[@id='timelineStart']")
	public WebElement startTime;
	
	@FindBy(xpath="//select[@id='timelineFinish']")
	public WebElement finishTime;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchButton;
	//i[@class='fa fa-search']
	@FindBy(xpath="//h2[@class='subtitle']")
	public WebElement freeSpotSubtitle;
	
}
