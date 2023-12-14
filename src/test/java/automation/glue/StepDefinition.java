package automation.glue;

import automation.config.AutomationFrameworkConfiguration;
import automation.driver.DriverSingleton;
import automation.pages.HomePage;
import automation.pages.LoginPage;
import automation.utils.ConfigurationProperties;
import automation.utils.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @Autowired
    ConfigurationProperties configurationProperties;

    @Before
    public void initializeObjects(){
        DriverSingleton.getInstance(configurationProperties.getBrowser());
        loginPage = new LoginPage();
        homePage = new HomePage();

        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }



    //SIGN IN FEATURE

    @Given("Sono sulla pagina di login")
    public void sonoSullaPaginaDiLogin(){
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }

    @When("Entro con utente come {string} e password come {string}")
    public void entroConUtenteComeUsernameEPasswordComePassword(String utente , String password) {
        loginPage.login(utente, password);
    }

    @Then("Vedo la homepage")
    public void vedoLaHomepage() {
        driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
    }

    @Then("Vedo messaggio errore come {string}")
    public void vedoMessaggioErroreComeMessage(String message) {
        assertEquals(message , loginPage.errorMessage());
    }



    // ORDINAMENTO FEATURE

    @When("Ordina dalla A alla Z")
    public void ordinaDallaAAllaZ() {
        homePage.ordinamentoAZ();
    }

    @When("Ordina dalla Z alla A")
    public void ordinaDallaZAllaA() {
        homePage.ordinamentoZA();
    }

    @When("Ordina per prezzo crescente")
    public void ordinaPerPrezzoCrescente() {
        homePage.prezzoCresc();
    }

    @When("Ordina per prezzo decrescente")
    public void ordinaPerPrezzoDecrescente() {
        homePage.prezzoDecr();
    }

    @Then("Il primo prodotto è {string}")
    public void ilPrimoProdottoÈ(String prodotto) {
        assertEquals(prodotto , homePage.getFirstItemTitle());
    }


    //AGGIUNGI PRODOTTO CARRELLO

    @When("Aggiungi prodotto")
    public void aggiungiProdotto() {
        homePage.aggiungiProdottoALCarrello();

    }

    @Then("Carrello aggiornato")
    public void carrelloAggiornato() {
        assertEquals(homePage.getNumeroItemCarrello() , configurationProperties.getNumeroItem());
    }
}

