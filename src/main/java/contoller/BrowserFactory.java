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

    public static final String USERNAME = "umerashraf1";
    public static final String AUTOMATE_KEY = "sqzeZshyJXWvMzWGG26a";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public WebDriver createDriver() throws Exception {
        //NOTE : Creating Chrome driver
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
        } else if ("firefox".equals(browser)) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            driver.set(new FirefoxDriver());
        } else if ("chrome".equals(browser)) {
            if (getOSType().equals("Windows 10")) {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver.set(new ChromeDriver());
                return driver.get();
                } else {
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                    driver.set(new ChromeDriver());
                    return driver.get();
                }
        } else if ("remote".equals(browser)) {
            DesiredCapabilities caps = new DesiredCapabilities();
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
            System.out.println("Do not know how to start: " + browser + ", starting chrome.");
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver.set(new ChromeDriver());
        }
        return driver.get();
    }

public String getOSType() {
        String  os  = System.getProperty("os.name");
        System.out.println("I am using this OS: "+os);
        return os;
        }

}