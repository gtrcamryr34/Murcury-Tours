package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    String expectedTitle = "My Account";

    public void verifyPage(){
        waitUntilTitle(expectedTitle, 10);
    }
}
