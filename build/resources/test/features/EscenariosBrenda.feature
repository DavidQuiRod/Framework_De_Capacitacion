Feature: Escenarios creados por Brenda

  # Comentarios

  Scenario: Prueba1
    Given El usuario abre la pagina "urlBrenda" en el navegador de "chrome"

    @prueba2
  Scenario: Prueba 2
    Given El usuario abre la pagina "urlBrenda" en el navegador
   When El usuario espera 20 segundos
   Then finaliza el test "prueba2" y se cierra navegador

      @prueba3
      Scenario: Prueba 3
        Given El usuario abre la pagina "urlBrenda" en el navegador
        When El usuario espera 20 segundos
        And El usuario ingresa el username "Admin"
        And El usuario ingresa la contraseña "admin123"
        And El usuario da clic en el boton Login
        When El usuario espera 20 segundos
        Then finaliza el test "prueba2" y se cierra navegador