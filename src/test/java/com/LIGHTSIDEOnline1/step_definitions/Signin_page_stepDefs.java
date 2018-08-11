package com.LIGHTSIDEOnline1.step_definitions;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

import java.util.List;

import com.LIGHTSIDEOnline1.pages.Home_page;
import com.LIGHTSIDEOnline1.pages.Signin_page;
import com.LIGHTSIDEOnline1.utilities.ConfigurationReader;
import com.LIGHTSIDEOnline1.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signin_page_stepDefs {
	Signin_page signinpage = new Signin_page();
	Home_page homePage = new Home_page();
	WebDriver driver = Driver.getDriver();
	
	@Given("I open the sign in page")
	public void i_open_the_sign_in_page() {
		driver.get(ConfigurationReader.getProperty("url"));
	}

	@When("User enter an email without password")
	public void user_enter_an_email_without_password(List<String> email) {
		for (String eachemail : email) {

		signinpage.emailBox.clear();
		signinpage.emailBox.sendKeys(eachemail);	
		signinpage.passwordBox.clear();
		verify_the_sign_in_button_is_not_enable();
		}
	}

	@Then("verify the sign in button is not enable")
	public void verify_the_sign_in_button_is_not_enable() {
		assertTrue(!signinpage.singinButton.isEnabled()) ;
	}
	
	@When("User try to sign in using invalid email {string} and password {string}")
	public void user_try_to_sign_in_using_invalid_email_and_password(String email, String password) {
		signinpage.emailBox.clear();
		signinpage.emailBox.sendKeys(email);
		signinpage.passwordBox.clear();
		signinpage.passwordBox.sendKeys(password);
		
	}

	@Then("the error message should be displayed")
	public void the_error_message_should_be_displayed() {
		signinpage.singinButton.click();
		System.out.println(signinpage.errorMessage.getText());
	  assertTrue(signinpage.errorMessage.isDisplayed());
	}
	
	@When("User try to sign in using valid email {string} and invalid password {string}")
	public void user_try_to_sign_in_using_valid_email_and_invalid_password(String email, String password) {
		signinpage.emailBox.clear();
		signinpage.emailBox.sendKeys(email);
		signinpage.passwordBox.clear();
		signinpage.passwordBox.sendKeys(password);
	}
	
	@When("User login with valid {string} and {string}")
	public void user_login_with_valid_and(String email, String password) {
		signinpage.emailBox.clear();
		signinpage.emailBox.sendKeys(email);
		signinpage.passwordBox.clear();
		signinpage.passwordBox.sendKeys(password);
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		signinpage.singinButton.click();
		assertTrue(homePage.titleVA.isDisplayed());
	}

}
