import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://v1.training-support.net");

        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        WebElement aboutUsButton = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));

        aboutUsButton.click();

        String newPageTitle = driver.getTitle();
        System.out.println("New page title is: " + newPageTitle);


        driver.close();
    }
}
