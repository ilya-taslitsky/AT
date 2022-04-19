import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tests {
    StackOverFlowBO stackOverFlowBO = new StackOverFlowBO();

    @BeforeTest
    public void before() {
        BrowserFactory.initBrowser("chrome");
    }


    @Test
    public void testManipulate() {


        Assert.assertTrue(stackOverFlowBO.manipulate());

    }
    @Test
    public void testVisible() {


        Assert.assertTrue(stackOverFlowBO.checkVisible());

    }

}
