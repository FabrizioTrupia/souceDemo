package automation.pages;

import automation.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
    private WebDriver driver;
    public OverviewPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(css = "#cancel")
    private WebElement bottoneCancel;

    @FindBy(css = "#finish")
    private WebElement bottoneFinish;


}
