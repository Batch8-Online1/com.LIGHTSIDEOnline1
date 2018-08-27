package com.LIGHTSIDEOnline1.step_definitions;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.LIGHTSIDEOnline1.pages.Home_page;
import com.LIGHTSIDEOnline1.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Home_page_stepDefs {
	Home_page homepage = new Home_page();
	
	// this is not data driven test. if it single line fails, rest will fail.
	@Then("the menu should be displayed")
	public void the_menu_should_be_displayed(List<String> menus) {
		for (String menu : menus) {
			assertTrue(homepage.item(menu).isDisplayed());
		}
	}
	// this is data driven test
	@When("I click each room {string}")
	public void i_click_each_room(String room) {
	    homepage.item(room).click();
	}
	
	
	@Then("I should see the rooms name {string} in title")
	public void i_should_see_the_rooms_name_in_title(String room) {
		
	    assertTrue(homepage.room(room).isDisplayed());
	}

	

}
