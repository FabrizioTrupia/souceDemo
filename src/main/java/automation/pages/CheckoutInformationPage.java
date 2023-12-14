package automation.pages;

import automation.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformationPage {
    private WebDriver driver;

    public CheckoutInformationPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(css = "#first-name")
    private WebElement firstName;
    @FindBy(css = "#last-name")
    private WebElement lastName;
    @FindBy(css = "#postal-code")
    private WebElement postalCode;
    @FindBy(css = "#cancel")
    private WebElement bottoneCancel;
    @FindBy(css = "#continue")
    private WebElement bottoneContinue;

    public void compilaFirstName(String nome){
        firstName.sendKeys(nome);
    }
    public void compilaLastName(String cognome){
        lastName.sendKeys(cognome);
    }
    public void compilaPostalCode(String code){
        postalCode.sendKeys(code);
    }
    public void clickBottoneCancel(){
        bottoneCancel.click();
    }
    public void clickBottoneContinue(){
        bottoneContinue.click();
    }






}
