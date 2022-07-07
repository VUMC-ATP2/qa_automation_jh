package seleniumHomework;

import lombok.Getter;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectsHomework.*;

@Log4j
@Getter
public class sauceDemoTests {
    private final String URL = "https://www.saucedemo.com/";
    ChromeDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutSuccessPage checkoutSuccessPage;

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

   @Test
    public void openPageTest() {
       driver.get(URL);
       //pārbaudam, vai atveras lapa
       Assert.assertEquals(driver.getTitle(),"Swag Labs");
   }
    //pirmais scenarijs
   @Test
   public void elementTestFirst() {
       driver.get(URL);
       LoginPage loginPage = new LoginPage(driver);
       //ielogojamies
       loginPage.selfUsername("standard_user");
       loginPage.selfPassword("secret_sauce");
       loginPage.clickLoginButton();

       inventoryPage = new InventoryPage(driver);
       //pārbaudam,  ka lietotājs ir ielogojies
       Assert.assertEquals(inventoryPage.getPageTitle().getText(), "PRODUCTS");
       //ievietojam grozā jauno produktu
       inventoryPage.addToCart();
       //dodamies uz grozu
       inventoryPage.clickCartButton();

       cartPage = new CartPage(driver);
       //pārbaudam vai prece ir grozā
       Assert.assertEquals(cartPage.getItemName().getText(),"Sauce Labs Bike Light");
       //dodamies uz checkout
       cartPage.clickCheckotButton();

      checkoutPage = new CheckoutPage(driver);
      //ievadam datus
      checkoutPage.selfFirstName("John");
      checkoutPage.selfLastName("Doe");
      checkoutPage.selfPostalCode("25849-45");
      //dodamies uz checkout overview
       checkoutPage.clickContinueButton();

       checkoutOverviewPage = new CheckoutOverviewPage(driver);
       //parbaudam datus
       Assert.assertEquals(checkoutOverviewPage.getInventoryItem().isDisplayed(),true);
       //dodamies uz finish lapu
       checkoutOverviewPage.clickFinishButton();

       checkoutSuccessPage = new CheckoutSuccessPage(driver);
       //parbaudam, vai viss bija veiksmigi
       Assert.assertEquals(checkoutSuccessPage.getCheckoutComplete().isDisplayed(),true);
       //dodamies uz pirmo lapu
       checkoutSuccessPage.clickBackHomeButton();
   }

    @Test
    public void elementTestSecond() {
        driver.get(URL);
        loginPage = new LoginPage(driver);
        loginPage.selfUsername("standard_user");
        loginPage.selfPassword("secret_sauce");
        loginPage.clickLoginButton();

        inventoryPage =new InventoryPage(driver);
        inventoryPage.clickCartButton();

        cartPage = new CartPage(driver);
        cartPage.clickCheckotButton();

        checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorButton().getText(),"Error: First Name is required");
        checkoutPage.selfFirstName("Anna");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorButton().getText(),"Error: Last Name is required");
        checkoutPage.selfLastName("Winter");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorButton().getText(),"Error: Postal Code is required");

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }











}
