package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AddProductPage;

public class AddProductSteps {


    AddProductPage addProductPage = new AddProductPage();

    @Given("the user launches the Amazon website")
    public void theUserLaunchesTheAmazonWebsite() {
        addProductPage.launchAmazonSite("https://www.amazon.co.uk/");
    }

    @When("the user searches for {string}")
    public void theUserSearchesFor(String searchTerm) {
        addProductPage.typeSearchTermAndEnter(searchTerm);
    }

    @And("the user selects the first search result")
    public void theUserSelectsTheFirstSearchResult() throws InterruptedException {
        addProductPage.clickFirstSearchResult();
    }
}
