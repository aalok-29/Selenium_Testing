import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class helloSelenium {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new EdgeDriver();

        // Open the browser
        driver.get("https://v1.training-support.net");

        driver.quit();
    }
}