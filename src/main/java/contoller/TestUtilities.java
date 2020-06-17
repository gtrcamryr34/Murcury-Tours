package contoller;

import org.openqa.selenium.WebDriver;

public class TestUtilities extends BaseScript {

    protected void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}