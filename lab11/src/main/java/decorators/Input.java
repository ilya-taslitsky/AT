package decorators;

import org.openqa.selenium.WebElement;

public class Input extends Element
{

    public Input(WebElement input) {
        super(input);
    }

    public void sendMessage(String message)
    {
        getElement().sendKeys(message);
        System.out.println("Keys sent" + message);
    }
}
