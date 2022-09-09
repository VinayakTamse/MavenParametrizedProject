package vin.browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserFactory {

     static class SelBrowser {



        public static WebDriver BrowserType(String browsername)
        {
            WebDriver driver = null;
           if (browsername.equalsIgnoreCase("chrome"))
           {
               System.out.println("Launching Chrome Browser");
               System.setProperty("webdriver.chrome.driver", "./src/rescources/drivers/chromedriver.exe");
               driver = new ChromeDriver();
           }
           else if (browsername.equalsIgnoreCase("edge"))
           {
               System.out.println("Launching Edge Browser");
               System.setProperty("webdriver.edge.driver", "./src/rescources/drivers/msedgedriver.exe");
               driver = new EdgeDriver();
           }
           else {
               System.out.println("No Such Browser");
           }
           driver.manage().window().maximize();
           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
           return driver;
        }

    }

    public WebDriver getBrowser(String bname)
    {
       WebDriver driver = BrowserFactory.SelBrowser.BrowserType(bname);
       return driver;

    }



}
