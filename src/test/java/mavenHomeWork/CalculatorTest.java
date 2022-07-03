package mavenHomeWork;

import lombok.extern.log4j.Log4j;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Log4j
public class CalculatorTest {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void startTest() {
        log.info("Test starts");
    }

    @Test
    public void testAddMethod() {
        calculator = new Calculator();
        Assert.assertEquals(calculator.add(10, 30), 40);
    }

    @Test
    public void testSubstractMethod() {
        calculator = new Calculator();
        Assert.assertEquals(calculator.substract(30, 10), 20);
    }

    @Test
    public void testDivideMethod() {
        calculator = new Calculator();
        Assert.assertEquals(calculator.divide(30, 10), 3);
    }

    @Test
    public void testMultiplyMethod() {
        calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(30, 10), 300);
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        log.info("Test finished");
    }

}
