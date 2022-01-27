package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String expectedLoginFailure = "Invalid Email or password.";
    String expectedLoginTitle = "Log in | Ultra Photobooth";

    private By emailElement = By.name("user[email]");
    private By passwordElement = By.name("user[password]");
    private By loginButton = By.xpath("//*[@id=\"new_user\"]/div[2]/input");
    private By failLoginText = By.xpath("//*[@id=\"content-container\"]/div[1]");




    public void verifyLoginPage() {
        waitUntilTitle(expectedLoginTitle, 10);
    }

    public void login(String email, String password) {
        type(emailElement, email);
        type(passwordElement, password);
        waitUntilClick(loginButton, 5);
    }

    public void loginFailMessage() {
        untilShows(failLoginText, 10);
    }

}
