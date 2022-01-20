package contoller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BrowserFactory {

    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    private String browser;

    public BrowserFactory(String browser) {
        this.browser = browser.toLowerCase();
    }
    // THIS IS SETUP FOR REMOTE BROWSERSTACK LOGIN INFO
    public static final String USERNAME = "umerashraf1";
    public static final String AUTOMATE_KEY = "sqzeZshyJXWvMzWGG26a";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    // CREATEDRIVER METHOD WILL SETUP OUR DRIVERS NEEDS, SUCH AS WHICH VERSION AND WHERE THE DRIVER IS LOCATED,
    // THIS WILL ALSO SETUP ANY CAPABILITIES WE WANT THE DRIVER TO CONFIGURE TO RUN TO OUR LIKING
    public WebDriver createDriver() throws Exception {
        // JENKINS DRIVER IS FIRST IN THE IF STATEMENT
        // FOR ALL OF THESE YOU CAN SEE "".EQUALS(BROWSER) THIS MEANS THAT THE BROWSER SET FROM BASESCRIPT IS BEING SENT
        // HERE IN THE "browser" VARIABLE AND IT MATCHES WITH WHAT WE HAVE DEFINED WITH.
        if ("jenkins".equals(browser)) {
            System.setProperty("webdriver.chrome.driver", "/Users/uashraf/IdeaProjects/Murcury-Tours/src/main/resources/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            options.addArguments("--headless"); //should be enabled for Jenkins
            options.addArguments("--disable-dev-shm-usage"); //should be enabled for Jenkins
            options.addArguments("--window-size=1920x1080"); //should be enabled for Jenkins
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            cap.setCapability(ChromeOptions.CAPABILITY, options);
            driver.set(new ChromeDriver(options));
            // FIRFOX IS SECOND OPTION WITH LINK TO ITS DRIVER THE GECKODRIVER
        } else if ("firefox".equals(browser)) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            driver.set(new FirefoxDriver());
            // CHROME IS THE THIRD OPTION WITH LINK TO ITS DRIVER
        } else if ("chrome".equals(browser)) {
            // WE ARE DOING A GETOSTYPE BECAUSE WE WANT TO SET THE URL FOR THE DRIVER BASED ON IF YOU HAVAE WINDOWS OR MAC
            if (getOSType().equals("Windows 10")) {
                //FIRST OPTION  RUNS WINDOWS WITH A .EXE FILE EXTENSION
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver.set(new ChromeDriver());
                return driver.get();
                } else {
                    //SECOND OPTION HERE IS THE MAC VERSION OF THE DRIVER
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                    driver.set(new ChromeDriver());
                    return driver.get();
                }
            //THIS IS THE SETUP FOR USING BROWSERSTACK AND ITS CAPABILITIES
        } else if ("remote".equals(browser)) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("name", "Murcury Jenkins Run");
            caps.setCapability("os", "OS X");
            caps.setCapability("os_version", "Catalina");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "86.0");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("resolution", "1920x1080");
            caps.setCapability("browserstack.selenium_version", "3.14.0");
            WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
            return driver;
        } else {
            //WE NEED TO RUN THIS BECAUSE IF ALL OF THE ABOVE OPTIONS FAIL IT WILL COME TO THIS. AND IF THIS FAILS TEST WILL NOT RUN
            System.out.println("Do not know how to start: " + browser + ", starting chrome.");
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver.set(new ChromeDriver());
        }
        // WE NEED TO RETURN THE DRIVER BECAUSE WHEN WE CALL CREATEDRIVER IT WILL ALWAYS REQUIRE A DRIVER
        return driver.get();
    }
    //THIS METHOD GETS THE OS YOU ARE RUNNING THE TEST ON AND GIVES IT TO THE IF STATEMENT WHERE WE USE THIS ABOVE
    public String getOSType() {
        String  os  = System.getProperty("os.name");
        System.out.println("I am using this OS: "+os);
            return os;
    }
}