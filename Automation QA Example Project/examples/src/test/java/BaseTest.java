import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners( TakeScreenshotOnFailure.class )
public class BaseTest {

    protected WebDriver driver;

    public WebDriver getDriver() {
        if( null == driver ) {
            driver = new ChromeDriver();
        }

        return driver;
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

}
