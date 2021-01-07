package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProfilePage extends BasePage {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();


    public ProfilePage(WebDriver driver) {super(driver);}

    String ExpectedWelcomeText ="Hi, Demo User";
    String expectedlDate = dateFormat.format(date);

    private By WelcomeText = By.xpath("/html/body/div/div[1]/div[1]/div/div/div[1]/div/div[2]/h3");
    private By actualDate = By.xpath("/html/body/div/div[1]/div[1]/div/div/div[2]/div/span");
    private By clickInvoice = By.xpath("//*[@id=\"bookings\"]/div[2]/div[4]/a");

    public void verifiedWelcomeText(){Assert.assertEquals(driver.findElement(WelcomeText),ExpectedWelcomeText);}
    public void verifiedDate(){Assert.assertEquals(driver.findElement(actualDate),expectedlDate);}
    public void submitInvoice()  { waitUntilClick(clickInvoice,5);}



    }
