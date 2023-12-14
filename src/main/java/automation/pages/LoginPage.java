package automation.pages;

import automation.driver.DriverSingleton;
import automation.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(id = "user-name")
    private WebElement nomeutente;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement signInButton;
    @FindBy(css = "#login_button_container > div > form > div.error-message-container.error > h3")
    private WebElement errorMessage;


    public void login(String user , String password){
        nomeutente.sendKeys(user);
        this.password.sendKeys(password);
        signInButton.click();
    }

    public String errorMessage(){
        return errorMessage.getText();
    }

    public void loginHome(String user , String password){
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        nomeutente.sendKeys(user);
        this.password.sendKeys(password);
        signInButton.click();
    }


}

