import contoller.BaseScript;
import contoller.TestData;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagemodels.AccountPage;
import pagemodels.LandingPage;
import pagemodels.LoginPage;

public class LoginTest extends BaseScript {

    @Test
    public void loginTest() throws Exception {
        //Initializing the classes so we can use its methods and functions
        LandingPage landingPage = new LandingPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        landingPage.openHomePage();


        //Step 4: Click on "LOGIN"
        landingPage.openLoginLink();
        //Step 5&6: Type the credentials in their respective boxes
        loginPage.verifyLoginPage();

        loginPage.login(TestData.USERNAME, TestData.PASSWORD);
        //BONUS STEP: Verify Account Page
        loginPage.loginFailMessage();
    }

    @Test
    public void socialLinksTest() throws Exception {
        LandingPage landingPage = new LandingPage(driver);

        landingPage.verifyFacebookLink();
    }

    @AfterTest
    public void closeBrowser() throws Exception {
        driver.quit();
    }

}
