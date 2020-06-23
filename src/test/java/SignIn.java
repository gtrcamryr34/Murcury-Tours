import contoller.TestData;
import contoller.TestUtilities;
import org.testng.annotations.Test;
import pagemodels.FlightFinderPage;
import pagemodels.LandingPage;

public class SignIn extends TestUtilities {


    @Test

    public void signInWithUmerrr() throws Exception {
        LandingPage landingPage = new LandingPage(driver);
        FlightFinderPage flightFinderPage = new FlightFinderPage(driver);

        landingPage.openLandingPage();
        landingPage.enterUsername(TestData.LOGINUSERNAME);
        landingPage.enterPassword(TestData.LOGINPASS);
        landingPage.clickSignIn();
        flightFinderPage.verifySignoffText();

    }


}
