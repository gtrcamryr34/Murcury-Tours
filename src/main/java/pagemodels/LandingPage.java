package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPage extends BasePage {


    //Elements:
    private String pageUrl = "http://newtours.demoaut.com/index.php";

    private By register = By.linkText("REGISTER");
    private By registerPageVerify = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void openLandingPage() throws Exception {
        openUrl(pageUrl);
    }

    public void clickRegister() {
        click(register);
    }

    public void verifyRegisterPage() {
        verify(registerPageVerify);
    }



    public void URLs() {
        Assert.assertEquals(pageUrl, driver.getCurrentUrl());

    }


}
