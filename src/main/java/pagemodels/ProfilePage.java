package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.sql.Driver;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver) {super(driver);}
    String ExpectedWelcomeText ="Hi, Demo User";
    private By WelcomeText = By.xpath("/html/body/div/div[1]/div[1]/div/div/div[1]/div/div[2]/h3");

    public void verifiedWelcomeText(){Assert.assertEquals(driver.findElement(WelcomeText),ExpectedWelcomeText);}

}
