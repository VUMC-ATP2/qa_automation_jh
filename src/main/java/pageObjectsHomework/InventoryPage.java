package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver;
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }
    private By pageTitle = By.xpath("//*[@class='title']");

    private By addToCartButton = By.id("add-to-cart-sauce-labs-bike-light");
    private By cartButton = By.id("shopping_cart_container");
    public WebElement getPageTitle() {
        return driver.findElement(pageTitle);
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(addToCartButton);
    }
    public void addToCart() {
        getAddToCartButton().click();
    }
    public void clickCartButton() {
        driver.findElement(cartButton).click();
    }

}
