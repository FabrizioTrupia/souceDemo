package automation.pages;

import automation.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdottoPage {

    private WebDriver driver;

    public ProdottoPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    private WebElement aggiungiProdotto;
    @FindBy(css = "#remove-sauce-labs-backpack")
    private WebElement rimuoviProdotto;
    @FindBy(css = "#inventory_item_container > div > div > div.inventory_details_img_container > img")
    private WebElement immagineProdotto;
    @FindBy(css = "#back-to-products")
    private WebElement backToProducts;
    @FindBy(css = "#shopping_cart_container > a")
    private WebElement bottoneCarrello;

    public void clickAggiungiProdotto(){
        aggiungiProdotto.click();
    }

    public void clickRimuoviProdotto(){
        rimuoviProdotto.click();
    }

    public void clickImmagineProdotto(){
        immagineProdotto.click();
    }

    public void clickBackToProduct(){
        backToProducts.click();
    }

    public void clickBottoneCarrello(){
        bottoneCarrello.click();
    }
}
