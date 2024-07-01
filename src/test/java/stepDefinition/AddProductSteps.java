package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
    public void theUserSelectsTheFirstSearchResult()  {
        addProductPage.clickFirstSearchResult();
    }

    @And("the user adds the product to the basket")
    public void theUserAddsTheProductToTheBasket() {
        addProductPage.addProductToBasket();
    }

    @Then("the product is successfully added to the basket")
    public void theProductIsSuccessfullyAddedToTheBasket() {
        addProductPage.verifyProductIsAddedToCart();
    }
}
