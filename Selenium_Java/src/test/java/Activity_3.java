import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Activity_3 {
    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.edgedriver().setup();
        //Create a new instance of the Firefox driver
        driver = new EdgeDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    public void exampleTestCase() {
        WebElement username= driver.findElement(By.id("username"));
        WebElement password= driver.findElement(By.id("password"));
        username.sendKeys("admin");
        password.sendKeys("password");
        WebElement btn=driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
        btn.click();
        WebElement msg= driver.findElement(By.id("action-confirmation"));
        Assert.assertEquals(msg.getText(), "Welcome Back, admin");
    }

    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}