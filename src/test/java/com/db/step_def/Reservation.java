package com.db.step_def;

import org.openqa.selenium.WebDriver;

import com.LIGHTSIDEOnline1.pages.Home_page;
import com.LIGHTSIDEOnline1.pages.Hunt_page;
import com.LIGHTSIDEOnline1.pages.Signin_page;
import com.LIGHTSIDEOnline1.utilities.BrowserUtils;
import com.LIGHTSIDEOnline1.utilities.Driver;
import com.db.pages.SelfPage;
import com.db.pages.TopNavigationBar;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Reservation {
	Home_page homePage = new Home_page();
	Hunt_page huntPage = new Hunt_page();
	BrowserUtils utility = new BrowserUtils();
	WebDriver driver = Driver.getDriver();
	SelfPage selfpage = new SelfPage();
	
	@When("the user select day {string} from {string} to {string}")
	public void the_user_select_day_from_to(String date, String from, String to) {
		selfpage.hunt.click();
		//BrowserUtils.waitForVisibility(huntPage.dateBox,5);
		huntPage.dateBox.sendKeys(date);
	}

	@When("the user select the {string}")
	public void the_user_select_the(String string) {
	    
	}

	@Then("reservation info matches db records")
	public void reservation_info_matches_db_records() {
	    
	}
}
