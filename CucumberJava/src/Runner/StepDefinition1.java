package Runner;

import java.util.List;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import cucumber.table.DataTable;

public class StepDefinition1 {
	@Given("^User is alredy in login page$")
	public void User_is_alredy_in_login_page() {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("user is alredy in login page");
	}

	@When("^title of login page is free crm$")
	public void title_of_login_page_is_free_crm() {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("title of login page is free crm");
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable arg1) {
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
		List<List<String>> list = arg1.raw();
		System.out.println(list.get(0).get(0));
		System.out.println(list.get(0).get(1));
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("user clicks on login button");
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("user is on home page");
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() {
	    // Express the Regexp above with the code you wish you had
		System.out.println("user move to new del page");
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable arg1) {
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
		System.out.println("user enters deal");
		List<List<String>> data = arg1.raw();
		
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		System.out.println(data.get(0).get(2));
	    
	}

	@Then("^close the browser$")
	public void close_the_browser() {
	    // Express the Regexp above with the code you wish you had
		System.out.println("close the browser");
	}

}
