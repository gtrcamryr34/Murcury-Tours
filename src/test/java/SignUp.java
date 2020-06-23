import contoller.TestData;
import contoller.TestUtilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pagemodels.LandingPage;
import pagemodels.RegisterPage;

public class SignUp extends TestUtilities {

    @Test
    public void SignUpWithEmail() throws Exception {
        LandingPage landingPage = new LandingPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        // First Step Open Page url
        landingPage.openLandingPage();
        // Second Step Click Register
        landingPage.clickRegister();
        //Third Step Verify Sign Up page
        landingPage.verifyRegisterPage();
        //Fourth Step Enter Personal Info
        registerPage.enterPersonalInfo(TestData.FIRSTNAME, TestData.LASTNAME, TestData.PHONE, TestData.EMAIL);
        //Fifth Step Enter Address
        registerPage.enterAddress(TestData.STREET1, TestData.STREET2, TestData.CITY, TestData.STATE, TestData.POSTALCODE);
        registerPage.selectCountryDropdown(TestData.COUNTRY);
        //Sixth Step: Enter New Credentials
        registerPage.enterNewCredentials(TestData.USERNAME, TestData.PASSWORD, TestData.PASSWORD);
        //Seventh Step: Click the Submit Button
        registerPage.submitNewAccount();
        //Eighth Step: Verify User is Created
        registerPage.verifySuccess();
    }
    @AfterTest
    public void CloseBrowser() {
        driver.close();
    }
}
