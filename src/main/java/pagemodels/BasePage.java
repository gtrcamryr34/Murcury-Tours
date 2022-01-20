package pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    //This will open a page using the URL tht is passed when using the method
    protected void openPage(String url) {
        driver.get(url);
    }

    //This function translates to "Wait until element is clickable and then Click"
    protected void waitUntilClick(By locator, int secs) {
        (new WebDriverWait(driver, secs))
                .until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    //Type Method will type for us using Locator and Text we pass from usage
    protected void type(By locator, String text){
        find(locator).sendKeys(text);
    }
    //This function translates to "Wait until title is displayed as given title"
    protected void waitUntilTitle(String title, int secs) {
        (new WebDriverWait(driver, secs))
                .until(ExpectedConditions.titleIs(title));
    }
    protected void click(By locator) {
        find(locator).click();
    }







}
