package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@GenericUserTest")
	public void getAGenericUserFromGenericDatabase() {
		System.out.println("**********************************************");
		System.out.println("Getting a generic user from Generic Database");
	}
	@Before("@MortgageUserTest")
	public void getAMortgageUserFromMortgageDatabase() {
		System.out.println("**********************************************");
		System.out.println("Getting a Mortgage user from Mortgage Database");
	}
	@After
	public void tearDown() {
		System.out.println("Tear Down Method");
		System.out.println("#####################################################");
	}
}
