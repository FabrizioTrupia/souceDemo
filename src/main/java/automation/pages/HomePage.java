package automation.pages;

import automation.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    private WebDriver driver;

    public HomePage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(css = "#header_container > div.header_secondary_container > div > span > select")
    private WebElement containerOrdinamento;
    @FindBy(css = "#header_container > div.header_secondary_container > div > span > select > option:nth-child(1)")
    private WebElement ordAZ;
    @FindBy(css = "#header_container > div.header_secondary_container > div > span > select > option:nth-child(2)")
    private WebElement ordZA;
    @FindBy(css = "#header_container > div.header_secondary_container > div > span > select > option:nth-child(3)")
    private WebElement prezzoCresc;
    @FindBy(css = "#header_container > div.header_secondary_container > div > span > select > option:nth-child(4)")
    private WebElement prezzoDecr;
    @FindBy(css = "#inventory_container > div > div:nth-child(1)")
    private WebElement primoProdotto;
    @FindBy(css = ".inventory_item")
    private List<WebElement> items;
    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    private WebElement aggiungiProdotto;
    @FindBy(css = "#remove-sauce-labs-backpack")
    private WebElement rimuoviElemento;
    @FindBy(css = "#shopping_cart_container > a > span")
    private WebElement numeroItemCarrello;
    @FindBy(css = "#shopping_cart_container > a")
    private WebElement bottoneCarrello;
    @FindBy(css = "#item_4_title_link > div")
    private WebElement titoloProdotto;
    @FindBy(css = "#item_4_img_link > img")
    private WebElement immagineProdotto;
    @FindBy(css = "#react-burger-menu-btn")
    private WebElement elementiHamburger;
    @FindBy(css = "#inventory_sidebar_link")
    private WebElement allItems;
    @FindBy(css = "#about_sidebar_link")
    private WebElement aboutUs;
    @FindBy(css = "#logout_sidebar_link")
    private WebElement logout;
    @FindBy(css = "#reset_sidebar_link")
    private WebElement resetSidebar;


    private void clickContainerOrdinamento(){
        containerOrdinamento.click();
    }
    public void ordinamentoAZ(){
        clickContainerOrdinamento();
        ordAZ.click();
    }
    public void ordinamentoZA(){
        clickContainerOrdinamento();
        ordZA.click();
    }
    public void prezzoCresc(){
        clickContainerOrdinamento();
        prezzoCresc.click();
    }
    public void prezzoDecr(){
        clickContainerOrdinamento();
        prezzoDecr.click();
    }
    public String getFirstItemTitle() {
        WebElement firstItem = items.get(0);
        WebElement titleElement = firstItem.findElement(By.cssSelector(".inventory_item_name"));
        return titleElement.getText();
    }

    public void aggiungiProdottoALCarrello(){
        aggiungiProdotto.click();
    }

    public String getNumeroItemCarrello(){
        return numeroItemCarrello.getText();
    }

    public void clickBottoneCarrello(){
        bottoneCarrello.click();
    }

    public void clickRimuoviElemento(){
        rimuoviElemento.click();
    }

    public void clickTitoloProdotto(){
        titoloProdotto.click();
    }

    public void clickImmagineProdotto(){
        immagineProdotto.click();
    }

    public void clickElementiHamburger(){
        elementiHamburger.click();
    }

    public void clickAllItems(){
        allItems.click();
    }

    public void clickAboutUs(){
        aboutUs.click();
    }

    public void clickLogout(){
        logout.click();
    }

    public void clickResetApp(){
        resetSidebar.click();
    }
}
