package pages;

import Utils.BaseUtil;
import Utils.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProductPage extends BaseUtil {

     WebDriver driver;

    public AddProductPage() {
        this.driver = DriverManager.getDriver();
    }

    public void launchAmazonSite(String url) {
        driver.navigate().to(url);
        acceptCookiePolicy(By.id("a-autoid-0"));
    }
    public void typeSearchTermAndEnter(String itemName) {
        sendKeys(By.id("twotabsearchtextbox"), itemName);
    }
    public void clickFirstSearchResult()  {
        clickElement(By.xpath("//div[contains(@data-component-type,'s-search-result')]"));
    }
    public void addProductToBasket() {
        clickElement(By.id("add-to-cart-button"));
    }
    public void  verifyProductIsAddedToCart() {
        assertCartHasItems();
    }
}