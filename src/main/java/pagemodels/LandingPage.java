package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class LandingPage extends BasePage {

    public String pageUrl = "https://www.phptravels.net/home";

    private String pageTitle = "PHPTRAVELS | Travel Technology Partner";

    private By loginLink = By.linkText("Login");

    private By myAccountDropDown = By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/a");

    private By flightBtn = By.xpath("//*[@id=\"search\"]/div/div/div/div/div/nav/ul/li[2]/a");
    private By fromField = By.xpath("//*[@id=\"s2id_location_from\"]/a");
    private By firstSelection = By.xpath("//*[@id=\"select2-drop\"]/ul/li/div");
    private By toField = By.xpath("//*[@id=\"s2id_location_to\"]/a");

    private By dateDaySelect = By.xpath("//*[@id=\"datepickers-container\"]/div[9]/div/div[1]/div[2]/div[13]");
    private By dateMonthSelect = By.xpath("//*[@id=\"datepickers-container\"]/div[9]/div/div[2]/div/div[9]");
    private By dateYearSelect = By.xpath("//*[@id=\"datepickers-container\"]/div[9]/div/div[3]/div/div[2]");
    private By dateDepartCalendar = By.id("FlightsDateStart");
    private By dateReturnCalendar = By.id("FlightsDateEnd");
    private By dateMonthEntry = By.xpath("//*[@id=\"datepickers-container\"]/div[9]/nav/div[2]");
    private By dateYearEntry = By.xpath("//*[@id=\"datepickers-container\"]/div[9]/nav/div[2]");

    private By adultsSelectorAdd = By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[1]");
    private By adultsSelectorMinus = By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[2]");
    private By childSelector = By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[2]/div/div[2]/div/span/button[1]");

    private By searchBtn = By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[4]/button");

    public void verifyTitle() throws Exception {
        sleep(5000);
        Assert.assertEquals(driver.getTitle(), pageTitle);
        System.out.println(pageTitle + " compared to " + driver.getTitle());
    }

    public void clickMyAccount() {
        click(myAccountDropDown);
    }

    public void openLandingPage() {
        openUrl(pageUrl);
    }

    public void clickLogin() {
        click(loginLink);
    }

    public void clickFlights() {
        waitUntilClick(flightBtn, 10);
        click(flightBtn);
    }

    public void enterFrom() {
        waitUntilClick(fromField, 10);
        type("JFK", fromField);
        waitUntilClick(firstSelection, 10);
    }

    public void enterTo() {
        waitUntilClick(toField, 10);
        type("DXB", toField);
        waitUntilClick(firstSelection, 10);
    }

    public void selectDate9_11() {
        click(dateDepartCalendar);
        click(dateMonthEntry);
        click(dateMonthSelect);
        click(dateDaySelect);
    }

    public void addAdultSeat() {
        click(adultsSelectorAdd);
        click(adultsSelectorAdd);
    }

    public void addChildSeat() {
        click(childSelector);
        click(childSelector);
    }

    public void clickSearchBtn() {
        click(searchBtn);
    }


    public LandingPage(WebDriver driver) {
        super(driver);
    }



}
