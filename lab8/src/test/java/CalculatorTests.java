import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests
{
    @Test
    public void addTest()
    {
        Assert.assertEquals(Calculator.add(1,3),4.0);
    }

    @Test
    public void divideTest()
    {
        Assert.assertEquals(Calculator.divide(9,3),3.0);
    }
    @Test
    public void subTest()
    {
        Assert.assertEquals(Calculator.sub(9,3),6.0);
    }
    @Test
    public void multiplyTest()
    {
        Assert.assertEquals(Calculator.multiply(2,3),6.0);
    }

}
