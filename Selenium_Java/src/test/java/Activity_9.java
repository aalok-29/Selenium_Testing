import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_9 {
    WebDriver driver;

    @BeforeClass()
    public void berforeMethod() {
        WebDriverManager.chromedriver().setup();
        ;
        driver = new EdgeDriver();

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
    }
    @BeforeMethod
    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
    @Test
    public void simpleAlertTestCase() {
        driver.findElement(By.id("simple")).click();
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + simpleAlert.getText());
        simpleAlert.accept();
    }

    @Test
    public void confirmAlertTestCase() {
        driver.findElement(By.id("confirm")).click();
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirm Alert Text: " + confirmAlert.getText());
        confirmAlert.dismiss();
    }

    @Test
    public void promptAlertTestCase() {
        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert Text: " + promptAlert.getText());
        promptAlert.accept();
    }

    public void afterMethod () {
        //Close the browser
        driver.close();
    }
}