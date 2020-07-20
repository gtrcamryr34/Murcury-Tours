import contoller.TestData;
import contoller.TestUtilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pagemodels.LandingPage;
import pagemodels.RegisterPage;

public class SignUp extends TestUtilities {

    @Test
    public void SignUpWithEmail() throws Exception {

    }
    @AfterTest
    public void CloseBrowser() {
        driver.close();
    }
}
