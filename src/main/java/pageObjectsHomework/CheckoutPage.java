package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By errorButton = By.xpath("//*[@data-test='error']");

    public WebElement getFirstNameField() {
        return driver.findElement(firstNameField);
    }
    public void selfFirstName(String value) {
        driver.findElement(firstNameField).sendKeys(value);
    }
    public WebElement getLastNameField() {
        return driver.findElement(lastNameField);
    }
    public void selfLastName(String value) {
        driver.findElement(lastNameField).sendKeys(value);
    }
    public WebElement getPostalCodeField() {
        return driver.findElement(postalCodeField);
    }
    public void selfPostalCode(String value) {
        driver.findElement(postalCodeField).sendKeys(value);
    }
    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    public WebElement getErrorButton() {
        return driver.findElement(errorButton);
    }

}
