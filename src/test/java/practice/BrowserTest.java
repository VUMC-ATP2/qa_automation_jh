package practice;

import lombok.Getter;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

@Log4j
@Getter
public class BrowserTest {
    private final String LOCAL_FILE = "file://" + this.getClass().getResource("/elements.html").getPath();
    ChromeDriver driver;
    @BeforeTest
    public void setProperties() {
      System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
      Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
    }

    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        log.info("Initialize ChromeWebDriver");
        this.driver = new ChromeDriver();
    }

    @Test
    public void chromeDriverTest(){
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.manage().window().maximize();
    }

    @Test
    public void elementTest() {
        driver.get(LOCAL_FILE);
        WebElement nameField = driver.findElement(By.id("fNameID"));
        nameField.sendKeys("John");
        System.out.println("");
        WebElement surnameField = driver.findElement(By.id("lNameID"));
        surnameField.sendKeys("Doe");
        WebElement checkInfoButton = driver.findElement(By.id("checkDataID"));
        checkInfoButton.click();
    }


    @AfterMethod(alwaysRun = true)
        public void closeBrowser() {
        log.info("Closing ChromeWebDriver");
        driver.close();
        driver.quit();
    }
}
