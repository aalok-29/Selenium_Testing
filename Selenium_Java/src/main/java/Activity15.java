import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {

        // Initialize ChromeDriver
        WebDriver driver = new EdgeDriver();

            // Navigate to the URL
            driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
//
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);


            WebElement usernameField = driver.findElement(By.xpath("//input[starts-with(@class,'username-')]"));
//
            WebElement passwordField = driver.findElement(By.xpath("//input[starts-with(@class,'password-')]"));
//
//
            usernameField.sendKeys("admin");
            passwordField.sendKeys("password");


            WebElement loginMessage = driver.findElement(By.id("action-confirmation"));
            System.out.println("Login Message: " + loginMessage.getText());


            driver.quit();
        }
    }

