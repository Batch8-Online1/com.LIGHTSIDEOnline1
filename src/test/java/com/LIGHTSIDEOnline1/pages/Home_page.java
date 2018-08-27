package com.LIGHTSIDEOnline1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath="//a[contains(text(),'hunt')]")
	public WebElement huntButton;
	
	@FindBy(xpath="//h2[@class='subtitle']")
	public WebElement huntSubtitleDate;
	
	@FindBy(linkText = "map")
	public WebElement map;

	@FindBy(linkText = "schedule")
	public WebElement schedule;

	@FindBy(linkText = "hunt")
	public WebElement hunt;

	@FindBy(linkText = "my")
	public WebElement my;

	@FindBy(linkText = "self")
	public WebElement self;

	@FindBy(linkText = "team")
	public WebElement team;

	@FindBy(linkText = "sign out")
	public WebElement signOut;
	
	@FindBy(linkText = "berkeley")
	public WebElement berkeley;
	
	@FindBy(linkText = "duke")
	public WebElement duke;
	
	@FindBy(linkText = "stanford")
	public WebElement stanford;
	
	@FindBy(linkText = "mit")
	public WebElement mit;
	
	@FindBy(linkText = "harvard")
	public WebElement harvard;
	
	@FindBy(linkText = "yale")
	public WebElement yale;
	
	@FindBy(linkText = "princeton")
	public WebElement princeton;
	

	public WebElement item(String item) {
		return Driver.getDriver().findElement(By.linkText(item));
	}
	
	public WebElement room(String room) {
		return Driver.getDriver().findElement(By.xpath("//h1[.='"+ room+"']"));
	}
	
	public void goTomySelf() {
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(my).perform();
		self.click();
	}

	public void goToTeam() {
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(my).perform();
		team.click();
	}
}
