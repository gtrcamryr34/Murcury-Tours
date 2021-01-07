import contoller.BaseScript;
import contoller.TestData;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pagemodels.LandingPage;
import pagemodels.LoginPage;
import pagemodels.SignUpPage;

public class SignUpTest extends BaseScript {

    @Test
    public void signUpTest() throws Exception{

        LandingPage landingPage = new LandingPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        //toggling back and forth from MyAccountDropdown - signup to log in, and back to signup page
        landingPage.openHomePage();
        landingPage.openMyAccount();
        landingPage.openSignUpLink();
        signUpPage.openMyAccount();
        signUpPage.openLoginLink();
        loginPage.openMyAccount();
        loginPage.openSignUpLink();

        // Verifies the page
        signUpPage.verifySignUpPageTitle();

        //testing to see if the language dropdown works and selects a language. selects spanish, then back to english
        signUpPage.openLanguageDropDown();
        signUpPage.languageSpanish();
        signUpPage.openLanguageDropDown();
        signUpPage.languageEnglish();

        // Testing to see if the currencyDropdown button works. selects GBP then back to USD.
        signUpPage.openCurrencyDropDown();
        signUpPage.currencyGBPSelect();
        //signUpPage.openCurrencyDropDown();
        //signUpPage.currencyUSDSelect();


        // Test "home" link
        signUpPage.homeLinkClick();
        signUpPage.verifyLandingPageTitle();

        landingPage.openMyAccount();
        landingPage.openSignUpLink();

        signUpPage.verifySignUpPageTitle();

        //Test "Company" link -- contact us
        signUpPage.companyLinkClick();
        signUpPage.companyContactLinkClick();
        signUpPage.contactUsMyAccountDropDownClick();
        signUpPage.setContactUsSignUPLinkClick();

        // Test "Company" link -- About Us
        signUpPage.companyLinkClick();
        signUpPage.setCompanyAboutUsLinkClick();
        signUpPage.contactUsMyAccountDropDownClick();
        signUpPage.setContactUsSignUPLinkClick();

        // Fills all the Data to signup
        signUpPage.signUp(TestData.FIRSTNAME, TestData.LASTNAME,
                TestData.MOBILENUMBER, TestData.USERNAME, TestData.PASSWORD,
                TestData.CONFIRMPASSWORD);
    }

    @AfterTest
    public void closeBrowser(){
    driver.close();
   }

}
