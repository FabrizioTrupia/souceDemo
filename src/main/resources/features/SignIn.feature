
Feature: Login

  Background:
    Given Sono sulla pagina di login

  Scenario Outline: login corretta
    When Entro con utente come '<utente>' e password come '<password>'
    Then Vedo la homepage
    Examples:
      | utente                  | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | visual_user             | secret_sauce |
      | error_user              | secret_sauce |

  @negative
  Scenario Outline: utente bloccato
    When Entro con utente come '<nomeutente>' e password come '<password>'
    Then Vedo messaggio errore come '<message>'

    Examples:
      | nomeutente              | password      | message                |
      | locked_out_user         | secret_sauce  | Epic sadface: Sorry, this user has been locked out. |
      | locked_out_user         | wrongpassword | Epic sadface: Username and password do not match any user in this service |
      | standard_user           | wrongpassword | Epic sadface: Username and password do not match any user in this service |
      | performance_glitch_user | wrongpassword | Epic sadface: Username and password do not match any user in this service |
      | problem_user            | wrongpassword | Epic sadface: Username and password do not match any user in this service |
      | error_user              | wrongpassword | Epic sadface: Username and password do not match any user in this service |
      |                         |               | Epic sadface: Username is required |
      |                         | anypassword   | Epic sadface: Username is required |
      | standard_user           |               | Epic sadface: Password is required |


