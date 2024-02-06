import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//public class Activity9 {
//    public static void main(String[] args) {
//        // Create a new instance of the Edge driver
//        WebDriver driver = new EdgeDriver();
//
//        // Navigate to the URL
//        driver.get("https://v1.training-support.net/selenium/ajax");
//
//        // Find the "Change content" button and click it
//        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Change Content')]"));
//        button.click();
//
//        // Wait for the text to say "HELLO!"
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
//
//        // Print the message that appears on the page
//        WebElement message = driver.findElement(By.id("ajax-content"));
//        System.out.println(message.getText());
//
//        // Wait for the text to change to contain "I'm late!"
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
//
//        // Print the new message on the page
//        message = driver.findElement(By.id("ajax-content"));
//        System.out.println(message.getText());
//
//        // Close the browser
//        driver.quit();
//    }
//}
public class Activity9 {
    public static void main(String[] args) {
        // Setup the driver
//        WebDriverManager.firefoxdriver().setup();
        // Driver object reference
        WebDriver driver = new EdgeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/ajax");

        // Find the button and click it
        driver.findElement(By.cssSelector("button.violet")).click();
        // Wait for the new elements to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        // Find and print the new text
        String text = driver.findElement(By.tagName("h1")).getText();
        System.out.println(text);

        WebElement delayedText = driver.findElement(By.tagName("h3"));
        System.out.println(delayedText.getText());
        // Wait for the delayed text and print it
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        String lateText = driver.findElement(By.tagName("h3")).getText();
        System.out.println(lateText);

        // Close the browser
        driver.quit();
    }
}
