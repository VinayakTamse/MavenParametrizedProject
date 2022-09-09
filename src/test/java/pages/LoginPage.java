package pages;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    By username = By.cssSelector("input[name=username]");
    By password = By.xpath("//input[@name='password']");

    By login = By.xpath("//button[normalize-space(text()='Login')]");

    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String user)
    {
        driver.findElement(username).sendKeys(user);

    }

    public void enterPassword(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickOnLogin()
    {
        WebElement loginBtn = driver.findElement(login);
       Actions act = new Actions(driver);
       act.click(loginBtn).perform();
    }


}
