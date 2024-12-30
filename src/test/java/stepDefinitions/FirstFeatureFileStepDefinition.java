package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstFeatureFileStepDefinition {

	@Given("User is on net-banking landing page")
	public void user_is_on_net_banking_landing_page() {
	    System.out.println("Step 1 Executed : User landed on net banking page");
	}
	@When("User logs-in into application")
	public void user_logs_in_into_application() {
		System.out.println("Step 2 Executed : User is logged in into application");
	}
	
	@When("User logs-in into application with {string} and {string}")
	public void user_logs_in_into_application_with_and(String username, String password) {
		System.out.println("Step 2 Executed : User is logged in into application with: "+username+" / "+password);
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Step 3 Executed : User is landed on home page");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Step 4 Executed : User's cards are displayed on home page");
	}
	
	@Then("{int} Debit Cards are displayed")
	public void debit_cards_are_displayed(Integer int1) {
	    System.out.println("Step 5 Executed : Debit Cards ("+int1+") are displayed");
	}
	@Then("^User Code (.+) is displayed$")
	public void user_code_is_displayed(String str) {
	    //here (^ means starts-with and $ means ends-with and (.+) means any value that may be string or int or double...)
		System.out.println("Regular expression Output: "+str);
		
	}
	
	@Given("User is on Signup page")
	public void user_is_on_signup_page() {
	    System.out.println("User is on Signup page");
	}
	@When("User signs up into application")
	public void user_signs_up_into_application(List<String> data) {
		
		System.out.println("User is signed up with details : "+data.toString());
		
	}
	@Given("User with valid credentials")
	public void user_with_valid_credentials() {
		System.out.println("*******************************************************************");
	    System.out.println("Background : User is ready with credentials");
	}
	@When("User launches the browser")
	public void user_launches_the_browser() {
	    System.out.println("Background : User launches the browser");
	}
	@When("Clears the cookies in browser")
	public void clears_the_cookies_in_browser() {
	    System.out.println("Background : Cookies are cleared");
	}
}
	

