package contoller;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseScript {

    protected WebDriver driver;
    public static final String chrome = "chrome";
    public static final String browserStack = "remote";
    public static final String jenkins = "jenkins";
    // PARAMETERS IS SET FROM THE XMLFILES FILES, WHICH DECIDES WHAT BROWSER TYPE TO RUN, IF NON IS GIVEN THEN CODE WILL RUN THE LOCAL SETTING WITH @OPTIONAL
    @Parameters({ "chrome" })
    @BeforeMethod(alwaysRun = true)
    //  ALWAYS CHANGE THE BROWSER TO WHERE YOU WANT TO RUN IT
    public void setUp(@Optional(chrome)String browser) throws Exception {
        //THIS IS SETTING UP NEW DRIVER TO ALWAYS CALL BROWSERFACTORY FOR DRIVER CONFIG
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
