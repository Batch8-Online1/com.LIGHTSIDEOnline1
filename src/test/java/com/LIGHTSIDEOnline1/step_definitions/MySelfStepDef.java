package com.LIGHTSIDEOnline1.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.NoSuchElementException;

import com.LIGHTSIDEOnline1.pages.Home_page;
import com.LIGHTSIDEOnline1.pages.MySelfPage;
import com.LIGHTSIDEOnline1.pages.Team_Page;
import com.LIGHTSIDEOnline1.utilities.BrowserUtils;

import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MySelfStepDef {
	
	Home_page homepage = new Home_page();
	MySelfPage myselfPage =new MySelfPage();
	Team_Page teampage= new Team_Page();
	
	@When("the user go to the my self page")
	public void the_user_go_to_the_my_self_page() {
		homepage.goTomySelf();
	}
	@Then("the user verify all information")
	public void the_user_verify_all_information() {
		assertTrue(myselfPage.batch.isDisplayed());
		assertTrue(myselfPage.campus.isDisplayed());
		assertTrue(myselfPage.name.isDisplayed());
		assertTrue(myselfPage.role.isDisplayed());
	
	}


	@Then("user verify user is {string}")
	public void user_verify_user_is(String user) {
		BrowserUtils.waitForVisibility(myselfPage.role, 5);
		String role = myselfPage.role.getText();
		assertEquals(user, role);
	}

	@Then("user should see dark-side on the menu page")
	public void user_should_see_dark_side_on_the_menu_page() {
		BrowserUtils.waitForVisibility(myselfPage.switch_icon, 5);
	   assertTrue(myselfPage.switch_icon.isDisplayed());
	}

	@Then("user should NOT see dark-side on the menu page")
	public void user_should_NOT_see_dark_side_on_the_menu_page(){
		try {
			assertFalse(myselfPage.switch_icon.isDisplayed());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
	}
	@When("the user go to the team page")
	public void the_user_go_to_the_team_page() {
		BrowserUtils.waitForVisibility(homepage.team, 5);
	    homepage.goToTeam();
	    
	}

	@Then("user should verify all members have same {string}")
	public void user_should_verify_all_members_have_same(String group_name) {
	BrowserUtils.waitForVisibility(teampage.team_name, 5);
	assertEquals(group_name,teampage.team_name.getText());  
	}
	
	
	@BeforeStep
	public void waitforstep() {
		BrowserUtils.waitFor(3);
	}

}
