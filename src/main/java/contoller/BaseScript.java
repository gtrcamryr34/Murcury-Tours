package contoller;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseScript {

    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception{
        BrowserFactory factory = new BrowserFactory();
        driver = factory.createDriver();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
