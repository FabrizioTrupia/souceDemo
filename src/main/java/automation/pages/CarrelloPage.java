package automation.pages;

import automation.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarrelloPage {
    private WebDriver driver;

    public CarrelloPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(css = "#remove-sauce-labs-backpack")
    private WebElement rimuoviProdotto;
    @FindBy(css = "#continue-shopping")
    private WebElement bottoneContinueShopping;
    @FindBy(css = "#checkout")
    private WebElement bottoneCheckout;
    @FindBy(css = "#item_4_title_link > div")
    private WebElement titoloProdotto;

    public void clickRimuoviElemento(){
        rimuoviProdotto.click();
    }
    public void clickBottoneContinueShopping(){
        bottoneContinueShopping.click();
    }
    public void clickBottoneCheckout(){
        bottoneCheckout.click();
    }
    public void clickTitoloProdotto(){
        titoloProdotto.click();
    }
}
