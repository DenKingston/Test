package google.login.test;

import google.login.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SimpleTest {
    public static void main(String[] args) {

    }
    @Test
    public void verifyLogin() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/&hl=ru#identifier");
        LoginPage login = new LoginPage(driver);
        login.typeUsername("denykingston@gmail.com");
        login.typeNextButton();
        login.typePassword("p0lumorphp0lumorph");
        login.clickSignInButton();
    }
}
