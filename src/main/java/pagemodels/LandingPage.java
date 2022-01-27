package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPage extends BasePage {


    public LandingPage(WebDriver driver) {
        super(driver);
    }
    String expectedPageTitle = "Photobooth In Edison NJ | Photo Booth Rental NJ |Ultra PhotoBooth";
    String expectedLoginTitle = "Login";
    String expectedFBTitle = "Ultra Photobooth";
    String expectedIATitle = "Login • Instagram";

    String pageUrl = "https://www.ultraphotobooth.com";

    private By portalLoginLink = By.linkText("CLIENT PORTAL SIGN IN");
    private By bookNow = By.xpath("//*[@id=\"pc\"]/body/section[1]/div/div/a/div/div/p/span/span");
    private By instagramBtn = By.xpath("//*[@id=\"pc\"]/body/header/div/div/a[1]/div/svg");
    private By facebookBtn = By.xpath("//*[@id=\"1dd01e78-3631-4d98-ac55-305a69b77dd6\"]/path[1]");

    public void openHomePage() {
        openPage(pageUrl);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedPageTitle);
    }

    public void openLoginLink() {
        waitUntilClick(portalLoginLink, 5);
    }

    public void verifyFacebookLink() {
        waitUntilClick(instagramBtn, 5);
        waitUntilTitle(expectedFBTitle, 5);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedFBTitle);
    }

    public void openSignUpLink() {waitUntilClick(bookNow, 5);}

}
