package automation.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFox implements DriverStrategy{
    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver" , "src/main/resources/geckodriver.exe");
        WebDriver driver = new ChromeDriver();

        return driver;
    }
}
