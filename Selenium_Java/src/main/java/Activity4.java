import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity4 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new EdgeDriver();


        driver.get("https://v1.training-support.net/selenium/target-practice");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());


        String thirdHeaderText = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println(thirdHeaderText);
        // Find the 5th header and print its colour
        String fifthHeaderColor = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
        System.out.println(fifthHeaderColor);


        String violetButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println(violetButtonClass);

        String greyButtonText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println(greyButtonText);


        driver.close();
    }
}


