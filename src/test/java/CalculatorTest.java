import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sum(10.00,25.00),35);
    }
    @Test
    public void testSubtract() {
        Calculator calculatorOne = new Calculator();
        Assert.assertEquals(calculatorOne.subtract(20,10),10);
    }
    @Test
    public void testDivide() {
        Calculator calculatorTwo = new Calculator();
        Assert.assertEquals(calculatorTwo.divide(20,10),2);
    }
    @Test
    public void testMultiply() {
        Calculator calculatorThree = new Calculator();
        Assert.assertEquals(calculatorThree.multiply(10,20),200,"incorrect result");
    }

}
