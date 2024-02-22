import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");


        System.out.println("The title of the page is: " + driver.getTitle());


        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement dropzone1 = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(ball, dropzone1).build().perform();

        actions.pause(2000);
        WebElement dropzone1Text = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));

        if (dropzone1Text.getText().equals("Dropped!")) {
            System.out.println("Ball has been dropped in Dropzone 1.");
        } else {
            System.out.println("Ball has not been dropped in Dropzone 1.");
        }


        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        actions.dragAndDrop(ball, dropzone2).build().perform();


        WebElement dropzone2Text = driver.findElement(By.xpath("//*[@id=\"dropzone2\"]/p"));
        if (dropzone2Text.getText().equals("Dropped!")) {
            System.out.println("Ball has been dropped in Dropzone 2.");
        } else {
            System.out.println("Ball has not been dropped in Dropzone 2.");
        }


        driver.quit();
    }
}
