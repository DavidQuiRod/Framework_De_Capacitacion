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


    @prueba3
    Scenario:  prueba 3
      Given El usuario abre la pagina "urlJavier" en el navegador
      When El usuario espera 10 segundos
      And El usuario ingresa el Username "Admin"
      And El usuario ingresa el Password "admin123"
      Then Hacer clic en el boton Login
      When El usuario espera 10 segundos
      Then finaliza el test "prueba3" y se cierra navegador