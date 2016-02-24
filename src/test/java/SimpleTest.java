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

        WebElement searchField = driver.findElement(By.cssSelector(".//*[@id='Email']"));
        searchField.clear();
        searchField.sendKeys("deny_kingston@gmail.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement searchButton = driver.findElement(By.cssSelector(".//*[@id='next']"));
        searchButton.click();

    }
}
