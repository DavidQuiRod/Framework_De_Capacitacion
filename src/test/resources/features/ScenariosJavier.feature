Feature: Escenarios creados por Javier

  # Reglas de BDD
  # <- Este es un caracter para comentarios
Scenario: prueba 1
  Given El usuario abre la pagina "urlJavier" en el navegador de "chrome"

  @prueba2
  Scenario: prueba 2
    Given El usuario abre la pagina "urlJavier" en el navegador
    When El usuario espera 10 segundos
    Then finaliza el test "prueba2" y se cierra navegador

    @prueba3Javier
    Scenario:  prueba 3 Javier
      Given El usuario abre la pagina "urlJavier" en el navegador
      And El usuario ingresa el Username "Admin"
      When El usuario espera 5 segundos
      #And El usuario ingresa el Password "admin123"
      Then Hacer clic en el boton Login
      Then finaliza el test "prueba3Javier" y se cierra navegador

  @prueba4TeamAutomation
  Scenario:  prueba 4 TeamAutomation
    Given El usuario abre la pagina "urlJavier" en el navegador
    And El usuario ingresa el Username "Admin"
    When El usuario espera 2 segundos
    And El usuario ingresa el Password "admin123"
    When El usuario espera 2 segundos
    Then Hacer clic en el boton Login
    When El usuario espera 2 segundos
    Then finaliza el test "prueba4TeamAutomation" y se cierra navegador