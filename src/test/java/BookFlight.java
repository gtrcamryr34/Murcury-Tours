import contoller.TestData;
import contoller.TestUtilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pagemodels.AccountPage;
import pagemodels.FlightBookingPage;
import pagemodels.LandingPage;
import pagemodels.LoginPage;

public class BookFlight extends TestUtilities {

    @Test
    public void bookFlightToDubai() throws Exception {
//Login
        LandingPage landingPage = new LandingPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        FlightBookingPage flightListPage = new FlightBookingPage(driver);
        landingPage.openLandingPage();
        landingPage.verifyTitle();
        landingPage.clickMyAccount();
        landingPage.clickLogin();
        loginPage.verifyLoginTitle();
        loginPage.loginCredentials(TestData.USERNAME, TestData.PASSWORD);
        accountPage.verifyPage();
// Booking Flight
        accountPage.clickHome();

        landingPage.clickFlights();
        landingPage.enterFrom();
        landingPage.enterTo();
        landingPage.selectDate9_11();
        landingPage.addAdultSeat();
        landingPage.addChildSeat();
        landingPage.clickSearchBtn();

        flightListPage.verifyFlightList();
        flightListPage.clickBookNow();

        flightListPage.enterPassengerInfo("DOODOO BUTTER", "34", "JIKC939393339KJJK");
        flightListPage.setAdditionalRequests("Hello I EAT HALAL ONLY ");
        flightListPage.clickConfirmBooking();
        flightListPage.verifyInvoiceTitle();
        flightListPage.clickPayOnArrival();
        flightListPage.verifyFlightReserved();


    }
    @AfterTest
    public void closeBrowser() throws Exception {
        driver.quit();
    }
}