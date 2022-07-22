package practice;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideConfig;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class TestSelenide {

    @Test
    public void testSelenide() {
        Selenide.open("https//www.lu.lv");
        System.out.println("123");

    }
}
