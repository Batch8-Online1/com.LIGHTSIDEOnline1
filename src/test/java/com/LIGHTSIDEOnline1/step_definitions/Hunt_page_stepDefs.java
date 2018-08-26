package com.LIGHTSIDEOnline1.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static com.LIGHTSIDEOnline1.utilities.BrowserUtils.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.LIGHTSIDEOnline1.pages.Home_page;
import com.LIGHTSIDEOnline1.pages.Hunt_page;
import com.LIGHTSIDEOnline1.pages.Signin_page;
import com.LIGHTSIDEOnline1.utilities.BrowserUtils;
import com.LIGHTSIDEOnline1.utilities.ConfigurationReader;
import com.LIGHTSIDEOnline1.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hunt_page_stepDefs {
	Signin_page signinpage = new Signin_page();
	Home_page homePage = new Home_page();
	Hunt_page huntPage = new Hunt_page();
	BrowserUtils utility = new BrowserUtils();
	WebDriver driver = Driver.getDriver();
	String subtitle1;
	String subtitle2;
	@Given("I open the sign in page with valid username {string} and password {string}")
	public void i_open_the_sign_in_page_with_valid_username_and_password(String email, String password) {
		driver.get(ConfigurationReader.getProperty("url"));
		signinpage.emailBox.sendKeys(email);
		signinpage.passwordBox.sendKeys(password);
		signinpage.singinButton.click();
		waitFor(3);
	}

	@When("user get hunt for spot page")
	public void user_get_hunt_for_spot_page() {
		homePage.huntButton.click();
		waitFor(20);
	}

	@Then("subtitle should be displayed")
	public void subtitle_should_be_displayed() {
		assertTrue(homePage.huntSubtitleDate.isDisplayed());
	}

	@Then("user select valid date and time")
	public void user_select_valid_date_and_time() {
		String subtitleDate = homePage.huntSubtitleDate.getText();
		//String currentMonth = (Integer.parseInt(subtitleDate.substring(5, 6))) + "";
		String currentDay = (Integer.parseInt(subtitleDate.substring(7, 9)) -
				utility.selectRandomNumberBetweenAtoB(0, 6)) + "";
		//System.out.println(currentMonth);
		//System.out.println(currentDay);
		huntPage.dateBox.click();

		huntPage.dateBox.sendKeys(currentDay);
		waitFor(2);
		utility.selectByIndex(huntPage.startTime, utility.selectRandomNumberBetweenAtoB(1, 20));
		waitFor(2);
		utility.selectByIndex(huntPage.finishTime, 3);
		waitFor(2);
	}

	@Then("user should be able to click on enabled search button")
	public void user_should_be_able_to_click_on_enabled_search_button() {
		assertTrue(huntPage.searchButton.isEnabled());
		huntPage.searchButton.click();
		waitFor(2);
	}

	@Then("subtitle should be displayed for free spot page")
	public void subtitle_should_be_displayed_for_free_spot_page() {
		assertEquals(huntPage.pageTitle.getText(), "free spots");
		subtitle1 = huntPage.pageSubtitle.getText();
	
	}

	@Then("user should be able to confirm an available room")
	public void user_should_be_able_to_confirm_an_available_room() {
		huntPage.bookButtons.get(utility.selectRandomNumberBetweenAtoB(1, huntPage.bookButtons.size()-1)).click();
		waitFor(2);
		assertEquals(huntPage.pageTitle.getText(), "booking confirmation");
		huntPage.confirmButton.click();
		waitFor(3);

	}

	@Then("user should see schedule page")
	public void user_should_see_schedule_page() {
		assertEquals(huntPage.pageTitle.getText(), "schedule");
		subtitle2 = huntPage.pageSubtitle.getText();
		System.out.println("reservation information : " + subtitle1);
		System.out.println("reservation completed by : " + subtitle2);

	}

	@Given("I log in the application")
	public void i_log_in_the_application() {

	}

	@When("I hover over {string}")
	public void i_hover_over(String string) {

	}

	@When("I click {string}")
	public void i_click(String string) {

	}

	@Then("I verify user information")
	public void i_verify_user_information() {

	}

}
