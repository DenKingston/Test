package google.login.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  {
    private  WebDriver driver;
    By userNameLocator = By.id ("Email");
    By passwordLocator = By.id ("Passwd");
    By signInButtonLocator = By.id("signIn");
    By nextButtonLocator = By.id("next");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeUsername(String uid) {
        driver.findElement(userNameLocator).sendKeys(uid);
    }

    public void typePassword(String pass) {
        driver.findElement(passwordLocator).sendKeys(pass);
    }

    public void typeNextButton() {
        driver.findElement(nextButtonLocator).click();

    }

    public void clickSignInButton() {

        driver.findElement(signInButtonLocator).click();
    }

   @FindBy(id = "error_block")
    private WebElement errorText;

   public boolean isError() {
       if (errorText.isDisplayed()) {
           return true;
       } else {
           return false;
       }
   }
    
}
