import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleTest {
    @Test
    public void navigateToGmailLoginPage(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/&hl=ru#identifier");

        WebElement addaccountButton = driver.findElement(By.cssSelector("#account-chooser-add-account"));
        addaccountButton.click();

        WebElement loginField = driver.findElement(By.cssSelector("#Email"));
        loginField.clear();
        loginField.sendKeys("deny_kingston@gmail.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement nextButton = driver.findElement(By.cssSelector("#next"));
        nextButton.click();

    }
}
