package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    private By itemName = By.id("item_0_title_link");
    private By checkotButton = By.id("checkout");
    public WebElement getItemName() {
        return driver.findElement(itemName);
    }
    public void clickCheckotButton() {
        driver.findElement(checkotButton).click();
    }





}
