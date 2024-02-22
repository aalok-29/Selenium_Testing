import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity12 {
    public static void main(String[] args) {
        WebDriver driver= new EdgeDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        WebElement textBox = driver.findElement(By.id("input-text"));
        System.out.println(textBox.isEnabled());
        WebElement enableButton = driver.findElement(By.id("toggleInput"));
        enableButton.click();
        System.out.println(textBox.isEnabled());
        driver.close();
    }
}
