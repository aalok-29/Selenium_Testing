import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Activity13 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/search?q=cheese&sca_esv=ba846a2fd35e5017&source=hp&ei=3W-7ZeOVDvvXseMPhMaKmAs&iflsig=ANes7DEAAAAAZbt97TPnf-T5xDfoYz3a6T0KGzuz_D3b&ved=0ahUKEwij-KX99ImEAxX7a2wGHQSjArMQ4dUDCA0&uact=5&oq=cheese&gs_lp=Egdnd3Mtd2l6IgZjaGVlc2UyCBAAGIAEGLEDMgsQLhiABBixAxiDATIOEAAYgAQYigUYsQMYgwEyCBAAGIAEGLEDMggQABiABBixAzILEAAYgAQYsQMYgwEyCBAAGIAEGLEDMggQABiABBixAzIFEAAYgAQyCBAAGIAEGLEDSOITUABYuAlwAHgAkAEAmAGQAaABtwaqAQMwLja4AQPIAQD4AQHCAhEQLhiABBixAxiDARjHARjRA8ICDhAuGIAEGIoFGLEDGIMBwgIFEC4YgATCAgsQLhiDARixAxiABMICCBAuGIAEGLED&sclient=gws-wiz");
        WebElement num= driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
        String[] parts = num.getText().split(" ");
        System.out.println(parts[1]);
        WebElement res= driver.findElement(By.xpath("//*[@id=\"rso\"]/div[6]/div/div/div[1]/div/div/span/a/h3"));
        System.out.println(res.getText());
//        driver.quit();
    }
}
