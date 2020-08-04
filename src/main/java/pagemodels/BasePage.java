package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void openUrl(String url) {
        driver.get(url);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    protected void type(String text, By locator) {
        find(locator).sendKeys(text);
    }

    protected void dropDownSelect(String text, By locator) {
        Select select = new Select(find(locator));
        select.selectByVisibleText(text);
    }

    protected void verify(By locator) {
        find(locator).isDisplayed();
    }

    protected void submit(By locator) {
        find(locator).submit();
    }
}
