package decorators;

import org.openqa.selenium.WebElement;

public class Button extends Element
{


    public Button(WebElement button) {
        super(button);
    }

    public void clickButton()
    {
        getElement().click();
    }
    public boolean isDisplayed()
    {
        return getElement().isDisplayed();
    }
}
