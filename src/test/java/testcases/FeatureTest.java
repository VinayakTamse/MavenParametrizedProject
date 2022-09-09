package testcases;

import Base.AppInfo;
import Base.Base;
import Base.Utils;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class FeatureTest {


   @Parameters({"Browser", "Url"})
   @Test
   public void test_apps(@Optional("Chrome") String browser, String url)
   {
         Base b = new Base();
         Base.launchBrowser(browser);
         Base.launchApp(url);
         Reporter.log(Utils.url(), true);
         Reporter.log(Utils.title(), true);
         b.quitBrowser();

   }

}
