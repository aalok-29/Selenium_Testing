import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity18 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://v1.training-support.net/selenium/selects");

        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        WebElement dropdown= driver.findElement(By.id("multi-select"));
        Select select= new Select(dropdown);

        select.selectByVisibleText("Javascript");
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);
        select.selectByValue("node");
        select.deselectByIndex(4);
        driver.close();
    }
}
