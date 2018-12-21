import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {


    @Test( description = "Create an Account Test" )
    @Step( "Create a new account" )
    public void testCreateAccount() throws InterruptedException {

        getDriver().get("http://www.google.com/xhtml");
        Thread.sleep(10000);
        getDriver().quit();
    }

    @Test( description = "Verify an Account Test" )
    @Step( "Verify Account details on the page." )
    public void testVerifyAccount() {
        getDriver().get("http://www.google.com/xhtml");
        Assert.fail();
    }

    @Test( description = "Edit Account Test" )
    @Step( "Edit existing Account" )
    public void testEditAccount() throws InterruptedException {
        getDriver().get("http://www.google.com/xhtml");
        Thread.sleep(10000);
        getDriver().quit();
    }
}
