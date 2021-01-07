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

    protected void openPage(String url) {
        driver.get(url);
    }

    protected void waitUntilClick(By locator, int secs) {
        //This function translates to "Wait until element is clickable and then Click"
        (new WebDriverWait(driver, secs))
                .until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void type(By locator, String text){
        find(locator).sendKeys(text);
    }

    protected void waitUntilTitle(String title, int secs) {
        //This function translates to "Wait until title is displayed as given title"
        (new WebDriverWait(driver, secs))
                .until(ExpectedConditions.titleIs(title));
    }







}
