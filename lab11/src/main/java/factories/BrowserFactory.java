package factories;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory
{
    private final static ThreadLocal<WebDriver> INSTANCE = new InheritableThreadLocal<>();
    public static WebDriver getDriver() {
        if (INSTANCE.get() == null)
            throw new RuntimeException("Instance null");
        return INSTANCE.get();
    }
    public static void initBrowser(String browser)
    {

        switch (browser) {
            case "chrome": {
                ChromeDriverManager.getInstance().setup();
                INSTANCE.set(new ChromeDriver());
                break;
            }
            case "firefox": {
                WebDriverManager.firefoxdriver().setup();
                INSTANCE.set(new FirefoxDriver());
                break;
            }
            case "safari": {
                WebDriverManager.safaridriver().setup();
                INSTANCE.set( new SafariDriver());
                break;
            }
            default: {
                throw new RuntimeException("Invalid browser");
            }

        }
    }
}