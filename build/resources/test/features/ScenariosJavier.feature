Feature: Escenarios creados por Javier

  #  #Generar los pasos necesario para llegar a ese apartado
  #
  #
  ##Que vamos a calificar los moderadores
  ##1.- Que funcione su escenario x
  ##2.- Reutilizacion de codigo y funciones que existen dentro del framework
  ##3.- Una evidencia limpia
  ##4.- Congruencia en el scenario se cumple el 90 de escenario por las etiquetas
  #
  ##Nota Punto extra el que termine primero
  ##Premio elegir proxima pagina a automatizar
  ## Cada uno de los participantes tiene 3 comodines U oportunidades

  #botón Admin Javier
  @PruebaAdminBoton
  Scenario:  prueba Javier  Boton Admin
    Given El usuario abre la pagina "urlJavier" en el navegador
    And El usuario ingresa el Username "Admin"
    When El usuario espera 2 segundos
    And El usuario ingresa el Password "admin123"
    When El usuario espera 2 segundos
    Then Hacer clic en el boton Login
    When El usuario espera 2 segundos
    Then El usuario da clic en boton Admin
    When El usuario espera 5 segundos
    Then finaliza el test "PruebaAdminBoton" y se cierra navegador