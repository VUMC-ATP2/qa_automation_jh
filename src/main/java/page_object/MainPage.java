package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver) {

        this.driver = driver;
    }
    //ka elementu var atrast
    //elementanosaukumsun bus atrats by ID
    private By firstNameField = By.id("fNameID");


    //getter kurs atgrizis elementu
    public WebElement getFirstNameField() {
        return driver.findElement(firstNameField);
    }

    public void selfFirstName(String value) {
        driver.findElement(firstNameField).sendKeys(value);
    }
    private By lastNameField = By.id("lNameID");
    public WebElement getLastNameField() {

        return driver.findElement(lastNameField);
    }
    public void selfLastName(String value) {

        driver.findElement(lastNameField).sendKeys(value);
    }
    private By infoAboutMe = By.id("aboutMeID");
    public WebElement getInfoAboutMe() {

        return driver.findElement(infoAboutMe);
    }
    public void selfAboutMe(String value) {

        driver.findElement(infoAboutMe).sendKeys(value);
    }

//button
    private By clickOnMEButton = By.xpath("//button[@id='checkDataID']");

    public void clickOnMe() {
        driver.findElement(clickOnMEButton).click();
    }
    //checkbox

    private By studentCheckBox = By.xpath("//input[@id='studentID' and @type= 'checkbox']");

    public void selectStudentCheckBox() {
        driver.findElement(studentCheckBox).click();
    }
    public WebElement getStudentCheckBox() {
        return driver.findElement(studentCheckBox);
    }
    //universityList
    private By univirsitiesList = By.name("universities");

    public List<WebElement> getAllUnivirsitiesOptions() {
        return new Select(driver.findElement(univirsitiesList)).getOptions();
    }
    public Select getUnivirsities() {

        return new Select(driver.findElement(univirsitiesList));
    }
    //radioButton
    private By javaRadioButton = By.xpath("//label[@for='javaID']");
    public WebElement getJavaRadioButton() {
        return driver.findElement(javaRadioButton);
    }
    //linkedIn
    //tabs
    private By linkedInURL = By.linkText("LinkedIn");
    public WebElement getLinkedInURL() {
        return driver.findElement(linkedInURL);
    }


    //gaidisana
    private By clickOnMeResult = By.id("checkDataResultID");
    public WebElement getClickOnMeResult() {
        return driver.findElement(clickOnMeResult);
    }


}
