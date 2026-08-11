Feature: Escenarios creados por Eduardo

  @Ejercicio_Eduardo
  Scenario: Prueba TeamAutomation
    Given El usuario abre la pagina "url1Eduardo" en el navegador
    And El usuario ingresa el Username "Admin"
    When El usuario espera 2 segundos
    And El usuario ingresa el Password "admin123"
    When El usuario espera 2 segundos
    Then Hacer clic en el boton Login
    When El usuario espera 5 segundos
    Then Hacer clic en el boton PIM
    When El usuario espera 4 segundos
    Then finaliza el test "Ejercicio_Eduardo" y se cierra navegador
