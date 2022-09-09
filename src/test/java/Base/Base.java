package Base;

import org.openqa.selenium.WebDriver;
import vin.browserfactory.BrowserFactory;

import java.time.Duration;

public class Base {

    public static WebDriver driver;

    public void Initialize(String browser, String url)
    {
        BrowserFactory factory = new BrowserFactory();
        driver = factory.getBrowser(browser);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));

    }

    public static void launchBrowser(String browser)
    {
        BrowserFactory factory = new BrowserFactory();
        driver = factory.getBrowser(browser);
    }

    public static void launchApp(String url)
    {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
    }

    public void quitBrowser()
    {
        driver.quit();
    }



}
