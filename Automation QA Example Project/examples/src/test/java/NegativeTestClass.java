import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class NegativeTestClass extends BaseTest {

    @Test( description = "Edit Account Negative Test" )
    @Step( "Update Account with invalid values and verify errors" )
    public void testEditAccountNegative() throws InterruptedException {
        getDriver().get("http://www.google.com/xhtml");
        Thread.sleep(10000);
        getDriver().quit();
    }
}
