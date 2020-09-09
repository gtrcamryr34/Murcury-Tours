package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    private By homebtn = By.xpath("//*[@id=\"mobileMenuMain\"]/nav/ul[1]/li/a");

    public void verifyPage(){
        driver.getPageSource().contains("Hi, Demo User");
        System.out.println(driver.getTitle());
    }

    public void clickHome() {
        waitUntilClick(homebtn, 10);
        click(homebtn);
    }
}
