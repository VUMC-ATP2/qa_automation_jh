package mavenHomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TitleTest {
    WebDriver chromeBrowser;

    @Test
    public void testPage(){
        chromeBrowser.navigate().to("https://www.wikipedia.org/");
        String expectedTitle = "Wikipedia";
        String actualTitle = chromeBrowser.getTitle();;
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void testSecondPage(){
        chromeBrowser.navigate().to("https://www.bbc.com/");
        String expectedTitle = "BBC - Homepage";
        String actualTitle = chromeBrowser.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @BeforeMethod
    public void open(){
        chromeBrowser = new ChromeDriver();
    }

    @AfterMethod
    public void close(){
        chromeBrowser.quit();
    }

}
