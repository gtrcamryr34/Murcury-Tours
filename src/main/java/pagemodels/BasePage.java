package pagemodels;

import jdk.nashorn.internal.ir.BlockLexicalContext;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
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

    protected void waitUntilClick(By locator, int secs)  {
       (new WebDriverWait(driver, secs))
                .until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void waitUntilVerify(By locator, int secs)  {
        (new WebDriverWait(driver, secs))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void pressEnter(By locator) {
        find(locator).sendKeys(Keys.RETURN);
    }

    protected void waitUntilTitle(String title, int secs)  {
        (new WebDriverWait(driver, secs))
                .until(ExpectedConditions.titleIs(title));
    }

    protected void submit(By locator) {
        find(locator).submit();
    }

    protected void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    protected void findText(String text) {
        driver.getPageSource().contains(text);

    }
}
