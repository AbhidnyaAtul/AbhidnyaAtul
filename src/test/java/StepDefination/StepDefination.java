package StepDefination;

import io.cucumber.java.en.*;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class StepDefination {

    @Given("^User is landing on login page$")
    public void user_is_landing_on_login_page() throws Throwable {
    	
    	System.out.println("User is landing successfully");
    }

    @When("^User logging into application using UserName and PassWord$")
    public void user_logging_into_application_using_username_and_password() throws Throwable {
    	System.out.println("User entered the username and password");
    }

    @Then("^Home Page is displayed$")
    public void home_page_is_displayed() throws Throwable {
    	System.out.println("User is Login successfully");
    }

    @And("^Account Balance is displayed$")
    public void account_balance_is_displayed() throws Throwable {
    	System.out.println("Account Balance is showing successfully");
    }

}