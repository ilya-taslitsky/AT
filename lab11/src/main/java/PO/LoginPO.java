package PO;

import decorators.Button;
import decorators.Input;
import factories.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPO
{
    @FindBy(xpath = "//*[@name='password']")
    private Input passInput;

    @FindBy(xpath = "//*[@name='email']")
    private Input loginInput;

    @FindBy(xpath = "//*[@type='submit']")
    private Button submitButton;

    @FindBy(xpath = "//button[@class='btn-lg btn btn-block btn-success buy']")
    Button buyButton;

    public LoginPO()
    {

        PageFactory.initElements(BrowserFactory.getDriver(), this);
    }

    public LoginPO inputLogin(String login)
    {
        WebDriverWait wait = new WebDriverWait(BrowserFactory.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(loginInput.getElement()));
        loginInput.sendMessage(login);
        return this;

    }

    public LoginPO inputPass(String pass)
    {
        passInput.sendMessage(pass);
        return this;
    }

    public LoginPO submit()
    {
        submitButton.clickButton();
        return this;
    }

    public boolean isOpen()
    {
        WebDriverWait wait = new WebDriverWait(BrowserFactory.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(buyButton.getElement()));
        return buyButton.isDisplayed();
    }
    public LoginPO goToLoginPage() {
        BrowserFactory.getDriver().get("https://testnet.bitmex.com/login");
        return this;
    }
}
