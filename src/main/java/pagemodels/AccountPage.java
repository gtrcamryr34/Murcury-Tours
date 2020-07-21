package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void verifyPage(){
        driver.getPageSource().contains("Hi, Demo User");
        System.out.println(driver.getTitle());
    }


}
