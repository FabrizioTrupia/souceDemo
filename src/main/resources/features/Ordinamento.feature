Feature: Ordinamento Home Page
  Background:
    Given Sono sulla pagina di login


  Scenario Outline: Ordinamento prodotti dalla A alla Z
    Given Entro con utente come '<utente>' e password come '<password>'
    When Ordina dalla A alla Z
    Then Il primo prodotto è '<prodotto>'

    Examples:
      | utente                  | password     | prodotto                 |
      | standard_user           | secret_sauce | Sauce Labs Backpack      |
      | visual_user             | secret_sauce | Sauce Labs Backpack      |

  Scenario Outline: Ordinamento prodotti dalla Z alla A
    Given Entro con utente come '<utente>' e password come '<password>'
    When Ordina dalla Z alla A
    Then Il primo prodotto è '<prodotto>'

    Examples:
      | utente                  | password     | prodotto                          |
      | standard_user           | secret_sauce | Test.allTheThings() T-Shirt (Red) |
      | visual_user             | secret_sauce | Test.allTheThings() T-Shirt (Red) |

  Scenario Outline: Ordinamento prodotti per prezzo crescente
    Given Entro con utente come '<utente>' e password come '<password>'
    When Ordina per prezzo crescente
    Then Il primo prodotto è '<prodotto>'

    Examples:
      | utente                  | password     | prodotto                 |
      | standard_user           | secret_sauce | Sauce Labs Onesie        |
      | visual_user             | secret_sauce | Sauce Labs Onesie        |

  Scenario Outline: Ordinamento prodotti per prezzo decrescente
    Given Entro con utente come '<utente>' e password come '<password>'
    When Ordina per prezzo decrescente
    Then Il primo prodotto è '<prodotto>'

    Examples:
      | utente                  | password     | prodotto                 |
      | standard_user           | secret_sauce | Sauce Labs Fleece Jacket |
      | visual_user             | secret_sauce | Sauce Labs Fleece Jacket |
