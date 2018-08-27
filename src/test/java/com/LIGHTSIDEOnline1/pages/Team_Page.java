package com.LIGHTSIDEOnline1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LIGHTSIDEOnline1.utilities.Driver;

public class Team_Page {
	public Team_Page() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath ="//h2[@class='subtitle']")
	public WebElement team_name;
	
}
