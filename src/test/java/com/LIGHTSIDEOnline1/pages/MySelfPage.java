package com.LIGHTSIDEOnline1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LIGHTSIDEOnline1.utilities.Driver;
import com.db.pages.TopNavigationBar;

public class MySelfPage {

		public MySelfPage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}

		@FindBy(xpath = "(//*[@class='title is-6'])[1]")
		public WebElement name;

		@FindBy(xpath = "(//*[@class='title is-6'])[2]")
		public WebElement role;

		@FindBy(xpath = "(//*[@class='title is-6'])[3]")
		public WebElement team;

		@FindBy(xpath = "(//*[@class='title is-6'])[4]")
		public WebElement batch;

		@FindBy(xpath = "(//*[@class='title is-6'])[5]")
		public WebElement campus;
		
		@FindBy(xpath = "//span[@class='switch icon is-size-4']")
		public WebElement switch_icon;
		
		

	}

