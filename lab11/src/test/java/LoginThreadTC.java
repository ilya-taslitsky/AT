import BO.LoginBO;
import factories.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginThreadTC
{
    @DataProvider(parallel = true)
    public static Object[][] browserDataProvider() {
        return new Object[][]{{"chrome"}};
    }
    //,{"firefox"}


    @Test(dataProvider = "browserDataProvider")
    public void loginTest(String browserName)
    {
        System.out.println(browserName);
        BrowserFactory.initBrowser(browserName);
        String login = "illya020030@gmail.com";
        String pass = "i3372214";
        LoginBO loginBO = new LoginBO();
        Assert.assertTrue(loginBO.login(login,pass));

    }


//    @AfterMethod
//    void quitBrowser()
//    {
//        BrowserFactory.getDriver().quit();
//    }
}