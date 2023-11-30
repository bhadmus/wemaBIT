package wemaobjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WemaPageObject {
    WebDriver driver;
    WebDriverWait wait;

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("about:blank");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    public void allUserLogin(String username){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Selectors.usernameField)));
        driver.findElement(By.cssSelector(Selectors.usernameField)).sendKeys(username);
        driver.findElement(By.cssSelector(Selectors.passwordField)).sendKeys(Selectors.password);
        driver.findElement(By.cssSelector(Selectors.loginButton)).click();
    }

    public void logout(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Selectors.burgerMenu)));
        driver.findElement(By.cssSelector(Selectors.burgerMenu)).click();
        WebElement logoutButton = driver.findElement(By.cssSelector(Selectors.logoutButton));
        wait.until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
    }
    public void verifyElementPresence(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Selectors.usernameField)));
    }


    public void tearDown(){
        driver.quit();
    }


}
