import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class StackOverFlowPO
{
    @FindBy(xpath = "//input[@name='q']")
    private WebElement input;
    @FindBy(xpath = "//span[@class='-img _glyph']")
    private WebElement logo;
    @FindBy(xpath = "/html/body/header/div/ol[2]/li[3]")
    private WebElement login;
    @FindBy(xpath = "/html/body/header/div/ol[2]/li[4]")
    private WebElement signUp;
    @FindBy(xpath = "//a[@class='s-topbar--menu-btn js-left-sidebar-toggle']")
    private WebElement menu;

    public StackOverFlowPO()
    {
        PageFactory.initElements(BrowserFactory.getDriver(), this);
    }
    public StackOverFlowPO goToStackOverFlow()
    {
        BrowserFactory.getDriver().get("https://stackoverflow.com");
        return this;
    }
    public boolean isOpen()
    {
        return login.isDisplayed();
    }

    public StackOverFlowPO sendTextToInput()
    {
        String str = "some text";
        WebDriverWait wait = new WebDriverWait(BrowserFactory.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(input));
        input.sendKeys(str);
        return this;
    }
    public boolean isInputVisible()
    {

        return input.isDisplayed();
    }
    public boolean isLogoVisible()
    {

        return logo.isDisplayed();
    }
    public boolean isLoginVisible()
    {

        return login.isDisplayed();
    }
    public boolean isSignUpVisible()
    {

        return signUp.isDisplayed();
    }
    public boolean isMenuVisible()
    {
        WebDriverWait wait = new WebDriverWait(BrowserFactory.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(menu));
        return menu.isDisplayed();
    }
    public void clickLogin()
    {
        Actions actions = new Actions(BrowserFactory.getDriver());
        actions.moveToElement(login).click().build().perform();
    }



}
