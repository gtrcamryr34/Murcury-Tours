package contoller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public WebDriver createDriver() {
        //NOTE : Creating Chrome driver
     if (getOSType().equals("Windows 10")) {
         System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
         driver.set(new ChromeDriver());
         return driver.get();
     } else{
         System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
         driver.set(new ChromeDriver());
         return driver.get();
     }
    }
    public String getOSType() {
        String  os  = System.getProperty("os.name");
        System.out.println("I am using this OS: "+os);
        return os;
    }
}
