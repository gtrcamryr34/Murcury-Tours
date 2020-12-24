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


    public void verifyLoginPage() {
        waitUntilTitle(expectedLoginTitle, 10);
    }

    public void login(String email, String password) {
        type(emailElement, email);
        type(passwordElement, password);
        waitUntilClick(loginButton, 5);
    }

}
