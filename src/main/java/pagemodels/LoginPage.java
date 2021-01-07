package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String expectedLoginTitle = "Login";

    private By emailElement = By.name("username");
    private By passwordElement = By.name("password");
    private By loginButton = By.xpath("//*[@id=\"loginfrm\"]/button");

    private By signUpLink = By.linkText("Sign Up");
    public void openSignUpLink() {waitUntilClick(signUpLink, 5);}


    public void openMyAccount()  {
        waitUntilClick(myAccountDropDown, 5);
    }
    private By myAccountDropDown =  By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/a");


    public void verifyLoginPage() {
        waitUntilTitle(expectedLoginTitle, 10);
    }

    public void login(String email, String password) {
        type(emailElement, email);
        type(passwordElement, password);
        waitUntilClick(loginButton, 5);
    }

}
