import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Test_Activity2 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void verifyPageTitle() {
        // Open the browser with the specified URL
        // Get and assert the title of the page
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        Assert.assertEquals(pageTitle, "Target Practice");
    }

    @Test
    public void incorrectAssertionForBlackButton() {
        // Look for the black button (replace with actual locator)
        // For example:
         WebElement btn = driver.findElement(By.cssSelector("button.black"));
//         black.click();

        // Incorrect assertion (intentionally to throw an error)
        Assert.assertTrue(btn.isDisplayed());
        Assert.assertEquals(btn.getText(),"black");
    }

    @Test(enabled = false)
    public void skipThirdTestMethod() {
        // This method will be skipped (enabled = false)
        // It won't be shown as skipped in the report
    }

    @Test
    public void skipFourthTestMethod() {
        // Skip this method by throwing a SkipException
        throw new SkipException("Skipping this test method intentionally");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser once the test is done
        driver.quit();
    }
}
