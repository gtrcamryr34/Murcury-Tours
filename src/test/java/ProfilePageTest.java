import contoller.BaseScript;
import contoller.TestData;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pagemodels.AccountPage;
import pagemodels.LandingPage;
import pagemodels.LoginPage;
import pagemodels.ProfilePage;

import java.text.DateFormat;
import java.util.Date;

public class ProfilePageTest extends BaseScript {

    @Test
    public void profilePageTest() throws Exception {
        LandingPage landingPage = new LandingPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);



        //Step 1 & 2 Open the chrome browser and Type the address "https://phptravels.net/home  " and hit enter
        landingPage.openHomePage();
        //Step 3: Click on "MY ACCOUNT"
        landingPage.openMyAccount();
        //Step 4: Click on "LOGIN"
        landingPage.openLoginLink();
        //Step 5&6: Type the credentials in their respective boxes
        loginPage.verifyLoginPage();
        loginPage.login(TestData.USERNAME, TestData.PASSWORD);
        //Step 7: Verify welcomeText beside profile picture
        profilePage.verifiedWelcomeText();
        //Step 8: Verify the date of the Profile Page
        profilePage.verifiedDate();
        //step 9: click invoice
        profilePage.submitInvoice();







    }

   @AfterTest
    public void closeBrowser() {
       driver.quit();
   }
}

