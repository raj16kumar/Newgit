package org.fb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {

	@Given("^User initialize the chrome browser$")
	public void user_initialize_the_chrome_browser() throws Throwable {
		
		System.out.println("User initialize the chrome browser");
	}

	@When("^User launch the facebook application$")
	public void user_launch_the_facebook_application() throws Throwable {
		System.out.println("User launch the facebook application");
	}

	@Then("^user enters the firstname and surname$")
	public void user_enters_the_firstname_and_surname() throws Throwable {
		System.out.println("user enters the firstname and surname");
	}

	@Then("^user enters the mobile number or email address$")
	public void user_enters_the_mobile_number_or_email_address() throws Throwable {
		System.out.println("user enters the mobile number or email address");
	}

	@Then("^user enters the new password$")
	public void user_enters_the_new_password() throws Throwable {
		System.out.println("user enters the new password");
	}

	@Then("^user enters the DOB$")
	public void user_enters_the_DOB() throws Throwable {
		System.out.println("user enters the DOB");
	}

	@Then("^user enters the gender$")
	public void user_enters_the_gender() throws Throwable {
		System.out.println("user enters the gender");
	}

	@Then("^user click sign up$")
	public void user_click_sign_up() throws Throwable {
		
		System.out.println("user click sign up");
	}

}
