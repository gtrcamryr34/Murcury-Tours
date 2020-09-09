package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightBookingPage extends BasePage {

    private String searchListTitle = "Flights List";

    private String invoiceTitle = "Invoice";

    private String reservedHeadingText = "Your booking status is Reserved";

    private By bookNowBTN = By.xpath("//*[@id=\"LIST\"]/li[1]/div/div[1]/div[2]/form/div[2]/div/button");

    private By additionalRequests = By.xpath("//*[@id=\"loggedform\"]/div/div[3]/div/div/textarea");

    private By reservedHeading = By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/h4");

    private By passengerName = By.id("passenger_name_0");
    private By passengerAge = By.id("passenger_age_0");
    private By passengerPassport = By.id("passenger_passport_0");

    private By confirmBookingBtn = By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/div/div[1]/div[2]/div[4]/button");



    public void verifyFlightList() {
        waitUntilTitle(searchListTitle, 15);
    }

    public void clickBookNow() {
        waitUntilClick(bookNowBTN, 10);
    }

    public void setAdditionalRequests(String requests){
        type(requests, additionalRequests);
    }

    public void enterPassengerInfo(String name, String age, String passport) {
        type(name, passengerName);
        type(age, passengerAge);
        type(passport, passengerPassport);
    }

    public void clickConfirmBooking(){
        click(confirmBookingBtn);
    }

    public void clickPayOnArrival() {
        By invoiceN = By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[5]/div[2]/div/ul/li[1]/span[2]");
        waitUntilVerify(invoiceN, 10);
        String invoicenum = invoiceN.findElement(find(invoiceN)).getText();
        By payOnArrivalBtn = By.xpath("//*[@id=\""+invoicenum+"\"]");
        System.out.println("Invoice number is: "+invoicenum);

       // WebElement invoiceNumber = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[5]/div[2]/div/ul/li[1]/span[2]"));
     //   String invoiceNumberText = invoiceNumber.getText();
       // System.out.println("Invoice number is: "+invoiceNumberText);
        click(payOnArrivalBtn);
        acceptAlert();
    }

    public void verifyInvoiceTitle() {
        waitUntilTitle(invoiceTitle, 15);
    }

   public void verifyFlightReserved() {
        findText(reservedHeadingText);
       waitUntilVerify(reservedHeading, 10);
       System.out.println(reservedHeading.findElement(find(reservedHeading)).getText());
       verify(reservedHeading);
   }

    public FlightBookingPage(WebDriver driver) {
        super(driver);
    }
}
