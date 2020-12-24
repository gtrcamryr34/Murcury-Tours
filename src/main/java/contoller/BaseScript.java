package contoller;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class BaseScript {

    protected WebDriver driver;
    public static final String chrome = "chrome";
    public static final String browserStack = "remote";
    public static final String jenkins = "jenkins";

    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional(chrome)String browser) throws Exception {
        BrowserFactory factory = new BrowserFactory(browser);
        driver = factory.createDriver();
        // This sleep here is for Umer only
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
