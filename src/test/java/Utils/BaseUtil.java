package Utils;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import Utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseUtil
    {

       WebDriver driver;

        public BaseUtil() {
            this.driver = DriverManager.getDriver();
        }

        public void sendKeys(By locator, String text) {
            driver.findElement(locator).sendKeys(text);
            driver.findElement(locator).sendKeys(Keys.ENTER);
        }
        public void clickElement(By locator)  {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(locator));
            driver.findElement(locator).click();
        }
        public void acceptCookiePolicy(By locator) {
        WebElement cookieBanner = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        if (cookieBanner.isDisplayed()) {
            cookieBanner.click();
        }
    }
        public int getCartItemCount() {
            WebElement cartCount = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-cart-count")));
            return Integer.parseInt(cartCount.getText().trim());
        }

        public void assertCartHasItems() {
            int itemCount = getCartItemCount();
            Assert.assertTrue("Cart is empty", itemCount > 0);
        }

    }

