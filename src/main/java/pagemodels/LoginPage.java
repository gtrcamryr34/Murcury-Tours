package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private String loginTitle = "Login";

    private By userName = By.name("username");
    private By passWord = By.name("password");

    private By rememberMe = By.name("remember");

    public void verifyLoginTitle(){
        Assert.assertEquals(loginTitle, driver.getTitle());
        System.out.println(loginTitle+" compared to "+driver.getTitle());
    }

    public void loginCredentials(String username, String password){
        type(username, userName);
        type(password, passWord);
        submit(passWord);
    }
}
