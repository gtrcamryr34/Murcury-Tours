package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPage extends BasePage {


    public LandingPage(WebDriver driver) {
        super(driver);
    }
    String expectedPageTitle = "PHPTRAVELS | Travel Technology Partner";
    String expectedLoginTitle = "Login";

    String pageUrl = "https://www.phptravels.net/";

    private By myAccountDropDown =  By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/a");
    private By loginLink = By.linkText("Login");
    private By signUpLink = By.linkText("Sign Up");

    public void openHomePage() {
        openPage(pageUrl);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedPageTitle);
    }

    public void openMyAccount()  {
        waitUntilClick(myAccountDropDown, 5);
    }

    public void openLoginLink() {
        waitUntilClick(loginLink, 5);
    }

    public void openSignUpLink() {waitUntilClick(signUpLink, 5);}

}
