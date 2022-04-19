import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTestsDP
{
    @Test(dataProvider = "add")
    public void addTest(double expected, double test)
    {
        Assert.assertEquals(test,expected);

    }

    @Test(dataProvider = "divide")
    public void divideTest(double expected, double test)
    {
        Assert.assertEquals(test,expected);

    }
    @Test(dataProvider = "sub")
    public void subTest(double expected, double test)
    {
        Assert.assertEquals(test,expected);

    }
    @Test(dataProvider = "multiply")
    public void multiplyTest(double expected, double test)
    {
        Assert.assertEquals(test,expected);
    }
}
