package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightFinderPage extends BasePage {

    private By signOffText = By.linkText("SIGN-OFF");

    public void verifySignoffText() {verify(signOffText);};

    public FlightFinderPage(WebDriver driver) {
        super(driver);
    }

}
