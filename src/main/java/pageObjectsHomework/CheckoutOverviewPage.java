package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {
    private WebDriver driver;
    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By inventoryItem = By.xpath("//div[contains(@class, 'inventory_item_name') and contains(., 'Sauce Labs Bike Light')]");
    private final By finishButton = By.id("finish");
    public WebElement getInventoryItem(){
        return driver.findElement(inventoryItem);
    }

    public void clickFinishButton(){
        driver.findElement(finishButton).click();
    }
}
