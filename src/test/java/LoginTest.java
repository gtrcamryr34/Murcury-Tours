import contoller.BaseScript;
import contoller.TestData;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pagemodels.AccountPage;
import pagemodels.LandingPage;
import pagemodels.LoginPage;

public class LoginTest extends BaseScript {

    @Test
    public void loginTest() throws Exception {
        LandingPage landingPage = new LandingPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        //Step 1 & 2 Open the chrome browser and Type the address "https://phptravels.net/home  " and hit enter
        landingPage.openHomePage();
        //Step 3: Click on "MY ACCOUNT"
        landingPage.openMyAccount();
        //Step 4: Click on "LOGIN"
        landingPage.openLoginLink();
        //Step 5&6: Type the credentials in their respective boxes
        loginPage.verifyLoginPage();
        loginPage.login(TestData.USERNAME, TestData.PASSWORD);
        //BONUS STEP: Verify Account Page
        accountPage.verifyPage();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
