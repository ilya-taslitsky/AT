package decorators;

import org.openqa.selenium.WebElement;

public class Element
{
    public Element(WebElement element) {
        this.element = element;
    }

    public WebElement getElement() {
        return element;
    }

    public void setElement(WebElement element) {
        this.element = element;
    }

    protected WebElement element;

}
