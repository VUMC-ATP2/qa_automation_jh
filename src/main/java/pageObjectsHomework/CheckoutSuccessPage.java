package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSuccessPage {
    private WebDriver driver;
    public CheckoutSuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By checkoutComplete = By.className("title");
    private final By backHomeButton = By.id("back-to-products");

    public WebElement getCheckoutComplete(){
        return driver.findElement(checkoutComplete);
    }
    public void clickBackHomeButton(){
        driver.findElement(backHomeButton).click();
    }


}
