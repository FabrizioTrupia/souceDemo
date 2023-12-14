package automation.pages;

import automation.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {

    private WebDriver driver;

    public CompletePage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(css = "#back-to-products")
    private WebElement backToProducts;

    public void clickBackToProducts(){
        backToProducts.click();
    }
}
