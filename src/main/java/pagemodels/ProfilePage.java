package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProfilePage extends BasePage {
    DateFormat dateFormat = new SimpleDateFormat("d MMMMM yyyy");
    Date date = new Date();


    public ProfilePage(WebDriver driver) {super(driver);}


    String expectedDate = dateFormat.format(date);


    private By actualDate = By.xpath("/html/body/div/div[1]/div[1]/div/div/div[2]/div/span");
    private By clickInvoice = By.xpath("//*[@id=\"bookings\"]/div[2]/div[4]/a");

    public void verifiedDate(){Assert.assertEquals(driver.findElement(actualDate).getText(),expectedDate);}
    public void submitInvoice()  { waitUntilClick(clickInvoice,5);}



    }
