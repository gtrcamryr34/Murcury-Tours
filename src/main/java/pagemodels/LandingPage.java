package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPage extends BasePage {

    private String pageUrl = "https://www.phptravels.net/home";

    private String pageTitle = "PHPTRAVELS | Travel Technology Partner";

    private By loginLink = By.linkText("Login");

    private By myAccountDropDown = By.xpath("/html/body/div[1]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/a");



    public void verifyTitle(){
        Assert.assertEquals(pageTitle, driver.getTitle());
        System.out.println(pageTitle+" compared to "+driver.getTitle());
    }

    public void clickMyAccount(){
        click(myAccountDropDown);
    }

    public void openLandingPage(){
        openUrl(pageUrl);
    }
    public void clickLogin(){
        click(loginLink);
    }













    public LandingPage(WebDriver driver) {
        super(driver);
    }




}
