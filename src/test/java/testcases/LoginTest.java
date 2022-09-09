package testcases;

import Base.Base;
import Base.AppInfo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest   {

    @Parameters({"user_name", "pass_word"})
    @Test

    public void Login_Test_Chrome(String user_name, String pass_word)
    {
        AppInfo b_chrome = new AppInfo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", user_name, pass_word, "chrome");
        Base base = new Base();
        LoginPage login = new LoginPage();
        base.Initialize(b_chrome.getBrowser(), b_chrome.getUrl());
        login.enterUserName(b_chrome.getUsername());
        login.enterPassword(b_chrome.getPassword());
        login.clickOnLogin();
        try {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        base.quitBrowser();

    }


    @Test
    public void Login_Test_Edge()
    {
        AppInfo b_chrome = new AppInfo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "Admin", "admin123", "edge");
        Base base = new Base();
        LoginPage login = new LoginPage();
        base.Initialize(b_chrome.getBrowser(), b_chrome.getUrl());
        login.enterUserName(b_chrome.getUsername());
        login.enterPassword(b_chrome.getPassword());
        login.clickOnLogin();
        try {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        base.quitBrowser();

    }
}
