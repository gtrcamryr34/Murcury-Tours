import contoller.TestData;
import contoller.TestUtilities;
import org.testng.annotations.Test;
import pagemodels.AccountPage;
import pagemodels.LandingPage;
import pagemodels.LoginPage;

public class SignIn extends TestUtilities {

    @Test
    public void signtest() throws Exception {
        LandingPage landingPage = new LandingPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        landingPage.openLandingPage();
        landingPage.verifyTitle();
        landingPage.clickMyAccount();
        landingPage.clickLogin();

        loginPage.verifyLoginTitle();
        loginPage.loginCredentials(TestData.USERNAME, TestData.PASSWORD);

        accountPage.verifyPage();
    }
}
