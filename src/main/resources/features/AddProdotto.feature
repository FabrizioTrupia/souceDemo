Feature: Aggiungere un prodotto

  Background:
    Given Sono sulla pagina di login
    When Entro con utente come 'standard_user' e password come 'secret_sauce'
    Then Vedo la homepage

  Scenario: Aggiunta di un prodotto dalla home page
    When Aggiungi prodotto
    Then Carrello aggiornato

