import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6{
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        Actions builder = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/input-events");


        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);

        builder.sendKeys("A").build().perform();
        // Press CTRL+A and CTRL+C
        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        driver.close();
    }
}
