import org.testng.annotations.DataProvider;

public class DProvider {

    @DataProvider(parallel = true)
    public Object[][] add() {
        return new Object[][]{
                {4.0, Calculator.add(3, 1)}
        };
    }
    @DataProvider(parallel = true)
    public Object[][] sub() {
        return new Object[][]{
                {6.0, Calculator.sub(9, 3)}
        };
    }
    @DataProvider(parallel = true)
    public Object[][] multiply() {
        return new Object[][]{
                {6.0, Calculator.multiply(2, 3)}
        };
    }
    @DataProvider(parallel = true)
    public Object[][] divide() {
        return new Object[][]{
                {3.0, Calculator.divide(9, 3)}
        };
    }
}