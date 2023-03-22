package upskill.ebay.stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		//Wait
	}
	

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsObj.searchShoes();
	}
	
	@When("^Search for Shirts$")
	public void search_for_Shirts() throws Throwable {
		EbayHomePageActionsObj.searchShirt();
	}
	
	@When("^Search for Pants$")
	public void search_for_Pants() throws Throwable {
		EbayHomePageActionsObj.searchPent();
	}
	
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomePageActionsObj.searchItems(items);
	}
	
	
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}