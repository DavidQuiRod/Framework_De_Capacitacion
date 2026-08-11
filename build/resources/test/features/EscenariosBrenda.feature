Feature: Escenarios creados por Brenda

  # Comentarios

  Scenario: Prueba1
    Given El usuario abre la pagina "urlBrenda" en el navegador de "chrome"

    @prueba2
  Scenario: Prueba 2
    Given El usuario abre la pagina "urlBrenda" en el navegador
   When El usuario espera 20 segundos
   Then finaliza el test "prueba2" y se cierra navegador

     @prueba3Brenda
     Scenario: Prueba 3 Brenda
       Given El usuario abre la pagina "url1Eduardo" en el navegador
       And El usuario ingresa el Username "Admin"
       When El usuario espera 5 segundos
       #And El usuario ingresa el Password
       Then finaliza el test "prueba3Brenda" y se cierra navegador

  @prueba4TeamAutomation
  Scenario: Prueba 4 TeamAutomation
    Given El usuario abre la pagina "url1Eduardo" en el navegador
    And El usuario ingresa el Username "Admin"
    When El usuario espera 2 segundos
    And El usuario ingresa el Password "admin123"
    When El usuario espera 2 segundos
    Then Hacer clic en el boton Login
    When El usuario espera 10 segundos
    Then finaliza el test "prueba4TeamAutomation" y se cierra navegador